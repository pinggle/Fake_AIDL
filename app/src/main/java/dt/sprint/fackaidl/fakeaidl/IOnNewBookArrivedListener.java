package dt.sprint.fackaidl.fakeaidl;

import android.os.RemoteException;

import dt.sprint.fackaidl.data.Book;

/**
 * Created by yanping on 16/7/20.
 */
public interface IOnNewBookArrivedListener extends android.os.IInterface {

    public void onNewBookArrived(Book newBook) throws RemoteException;

}
