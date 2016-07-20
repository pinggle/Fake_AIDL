package dt.sprint.fackaidl.fakeaidl;

import android.os.RemoteException;

import java.util.List;

import dt.sprint.fackaidl.data.Book;

/**
 * Created by yanping on 16/7/20.
 */
public interface IBookManager extends android.os.IInterface {

    public List<Book> getBookList() throws RemoteException;

    public void addBook(Book book) throws RemoteException;

    public void registerListener(IOnNewBookArrivedListener listener) throws RemoteException;

    public void unregisterListener(IOnNewBookArrivedListener listener) throws RemoteException;

}
