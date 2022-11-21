package vinoos.cordova.iap.util.communication;


import vinoos.cordova.iap.util.IabResult;

public interface BillingSupportCommunication {
    void onBillingSupportResult(int response);
    void remoteExceptionHappened(IabResult result);
}
