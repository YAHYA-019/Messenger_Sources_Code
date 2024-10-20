package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.Either;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;

/* renamed from: X.0px, reason: invalid class name */
/* loaded from: 0px.class */
public final class C0px implements Parcelable.Creator {
    public final int A00;

    public C0px(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r305v1, types: [com.facebook.push.fbns.ipc.FbnsAIDLRequest, com.facebook.push.fbns.ipc.FbnsAIDLResult] */
    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcelable parcelable;
        switch (this.A00) {
            case 0:
                parcelable = new Either(parcel, null);
                break;
            case 1:
                11T.A0F(parcel, 0);
                ?? fbnsAIDLResult = new FbnsAIDLResult(parcel);
                fbnsAIDLResult.A00 = parcel.readInt();
                parcelable = fbnsAIDLResult;
                break;
            case 2:
                11T.A0F(parcel, 0);
                parcelable = new FbnsAIDLResult(parcel);
                break;
            default:
                return null;
        }
        synchronized (0C9.A00) {
        }
        return parcelable;
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new Either[i];
            case 1:
                return new FbnsAIDLRequest[i];
            case 2:
                return new FbnsAIDLResult[i];
            default:
                return AnonymousClass001.A1Z();
        }
    }
}
