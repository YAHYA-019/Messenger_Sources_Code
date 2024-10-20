package X;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
import com.facebook.common.util.ParcelablePair;
import com.facebook.common.util.Triplet;
import com.facebook.profilo.multiprocess.ProfiloIPCParcelable;
import com.facebook.secure.strictfile.FileLocationScopeParcelable;

/* renamed from: X.0ph, reason: invalid class name */
/* loaded from: 0ph.class */
public final class C0ph implements Parcelable.Creator {
    public final int A00;

    public C0ph(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object c00x;
        switch (this.A00) {
            case 0:
                11T.A0F(parcel, 0);
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                11T.A0D(readParcelable);
                c00x = new IntentSenderRequest((Intent) parcel.readParcelable(Intent.class.getClassLoader()), (IntentSender) readParcelable, parcel.readInt(), parcel.readInt());
                break;
            case 1:
                c00x = new ParcelablePair(parcel);
                break;
            case 2:
                c00x = new Triplet(parcel);
                break;
            case 3:
                c00x = new ProfiloIPCParcelable(parcel);
                break;
            case 4:
                String readString = parcel.readString();
                readString.getClass();
                c00x = new C00X(readString);
                break;
            default:
                return null;
        }
        synchronized (0C9.A00) {
        }
        return c00x;
    }

    @Override // android.os.Parcelable.Creator
    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new IntentSenderRequest[i];
            case 1:
                return new ParcelablePair[i];
            case 2:
                return new Triplet[i];
            case 3:
                return new ProfiloIPCParcelable[i];
            case 4:
                return new FileLocationScopeParcelable[i];
            default:
                return AnonymousClass001.A1Z();
        }
    }
}
