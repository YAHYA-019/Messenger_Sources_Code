package X;

import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.lang.ref.WeakReference;

/* renamed from: X.180, reason: invalid class name */
/* loaded from: 180.class */
public final class AnonymousClass180 extends 0tZ implements 0Z6 {
    public static final 0KO A0C = new 0KO("DefaultFoundActivityLifecycleInfo");
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Object A05;
    public Object A06;
    public WeakReference A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C0ti A0B;

    public AnonymousClass180(Parcelable parcelable, C0ti c0ti, C0te c0te, 0Yr r305, 0Yw r306, C0cZ c0cZ, Object obj) {
        super(c0te, r305, r306, c0cZ, ServerW3CShippingAddressConstants.DEFAULT, true);
        ((0tZ) this).A04 = parcelable;
        ((0tZ) this).A07 = obj;
        this.A07 = null;
        this.A09 = false;
        this.A08 = false;
        this.A0A = false;
        this.A0B = c0ti;
    }

    public StringBuilder A03(StringBuilder sb, boolean z) {
        String str;
        String str2;
        sb.append(" Code: ");
        sb.append(this.A0B.A01());
        sb.append(" from ");
        if (this.A08) {
            sb.append("Message: [");
            sb.append("");
            sb.append(" what");
            sb.append(this.A02);
            sb.append("");
            sb.append(" obj");
            Object obj = this.A05;
            str2 = "Null";
            String str3 = str2;
            if (obj != null) {
                str3 = AnonymousClass001.A0Y(obj);
            }
            sb.append(str3);
            sb.append("");
            sb.append(" arg 1: ");
            sb.append(this.A00);
            sb.append("");
            sb.append(" arg 2: ");
            sb.append(this.A01);
            sb.append("");
            str = "]";
            sb.append(str);
            if (this.A0A) {
                sb.append("");
                sb.append(" And Also ");
                sb.append("");
                AnonymousClass001.A1D("Message Like: [", "", " obj", sb);
                Object obj2 = this.A06;
                AnonymousClass001.A1D(obj2 != null ? AnonymousClass001.A0Y(obj2) : "Null", "", " arg 1: ", sb);
                sb.append(this.A03);
                sb.append("");
                sb.append(" arg 2: ");
                sb.append(this.A04);
                sb.append("");
            }
            return sb;
        }
        str = this.A09 ? "parcel" : "unknown or defaults";
        sb.append(str);
        return sb;
    }

    public boolean A04(Message message) {
        this.A02 = message.what;
        this.A05 = message.obj;
        this.A00 = message.arg1;
        this.A01 = message.arg2;
        this.A08 = true;
        return true;
    }

    public boolean A05(Message message, 0tU r303) {
        boolean z = false;
        boolean z2 = true;
        try {
            this.A06 = r303.A02(1);
            this.A03 = r303.A01(1);
            this.A04 = r303.A01(2);
        } catch (C0dd e) {
            A0C.A03("Could not parse the given SomeArgs SomeArgs", e);
            this.A06 = null;
            z2 = false;
        }
        this.A02 = message.what;
        this.A05 = message.obj;
        this.A00 = message.arg1;
        this.A01 = message.arg2;
        if (z2) {
            z = true;
        }
        this.A08 = z;
        this.A0A = z2;
        return z2;
    }

    public boolean A06(Parcel parcel) {
        this.A07 = new WeakReference(parcel);
        this.A09 = true;
        return true;
    }

    public boolean A07(Parcelable parcelable, Object obj) {
        return true;
    }
}
