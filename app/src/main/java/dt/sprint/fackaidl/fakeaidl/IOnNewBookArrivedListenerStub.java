package dt.sprint.fackaidl.fakeaidl;

import android.os.IBinder;

import dt.sprint.fackaidl.data.Book;

/**
 * Created by yanping on 16/7/20.
 */
public abstract class IOnNewBookArrivedListenerStub extends android.os.Binder implements IOnNewBookArrivedListener {
    private static final java.lang.String DESCRIPTOR = "dt.sprint.fackaidl.fakeaidl.IOnNewBookArrivedListener";

    public IOnNewBookArrivedListenerStub() {
        this.attachInterface(this, DESCRIPTOR);
    }

    public static IOnNewBookArrivedListener asInterface(android.os.IBinder obj) {
        if (obj == null) {
            return null;
        }
        android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
        // 如果是同一个进程,也就是说进程内通信的话,我们就返回Stub对象;
        if ((iin != null) && (iin instanceof IOnNewBookArrivedListener)) {
            return ((dt.sprint.fackaidl.fakeaidl.IOnNewBookArrivedListener) iin);
        }
        // 如果不是同一个进程,那么我们就返回一个 Stub.Proxy 的 (Stub代理)对象;
        return new dt.sprint.fackaidl.fakeaidl.IOnNewBookArrivedListenerStub.Proxy(obj);
    }

    @Override
    public IBinder asBinder() {
        return this;
    }

    @Override
    public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
        switch (code) {
            case INTERFACE_TRANSACTION: {
                reply.writeString(DESCRIPTOR);
                return true;
            }
            case TRANSACTION_onNewBookArrived: {
                data.enforceInterface(DESCRIPTOR);
                Book _arg0;
                if ((0 != data.readInt())) {
                    _arg0 = Book.CREATOR.createFromParcel(data);
                } else {
                    _arg0 = null;
                }
                this.onNewBookArrived(_arg0);
                reply.writeNoException();
                return true;
            }
        }
        return super.onTransact(code, data, reply, flags);
    }

    private static class Proxy implements IOnNewBookArrivedListener {
        private android.os.IBinder mRemote;

        Proxy(android.os.IBinder remote) {
            mRemote = remote;
        }

        @Override
        public android.os.IBinder asBinder() {
            return mRemote;
        }

        public java.lang.String getInterfaceDescriptor() {
            return DESCRIPTOR;
        }

        @Override
        public void onNewBookArrived(Book newBook) throws android.os.RemoteException {
            android.os.Parcel _data = android.os.Parcel.obtain();
            android.os.Parcel _reply = android.os.Parcel.obtain();
            try {
                _data.writeInterfaceToken(DESCRIPTOR);
                if ((newBook != null)) {
                    _data.writeInt(1);
                    newBook.writeToParcel(_data, 0);
                } else {
                    _data.writeInt(0);
                }
                mRemote.transact(IOnNewBookArrivedListenerStub.TRANSACTION_onNewBookArrived, _data, _reply, 0);
                _reply.readException();
            } finally {
                _reply.recycle();
                _data.recycle();
            }
        }
    }

    static final int TRANSACTION_onNewBookArrived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
