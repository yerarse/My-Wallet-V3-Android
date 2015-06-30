package info.blockchain.wallet;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import piuk.blockchain.android.R;

public class ScanPairingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.include_setup0, container, false);

        rootView.setFilterTouchesWhenObscured(true);

        getActivity().setTitle(getResources().getString(R.string.scan_pairing_code));

        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        launchQRScan();
    }

    private void launchQRScan() {

        Intent intent = new Intent(getActivity(), ScanActivity.class);
        getActivity().startActivityForResult(intent, PairOrCreateWalletActivity.PAIRING_QR);
    }
}
