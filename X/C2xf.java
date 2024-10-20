package X;

import com.facebook.presence.api.model.RichStatus;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* renamed from: X.2xf, reason: invalid class name */
/* loaded from: 2xf.class */
public final class C2xf extends C04v {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    public C2xf(1F9 r302, ParcelableSecondaryData parcelableSecondaryData) {
        11T.A0F(r302, 2);
        this.A01 = parcelableSecondaryData;
        this.A02 = r302;
    }

    public C2xf(C5cs c5cs, User user) {
        11T.A0F(c5cs, 2);
        this.A02 = user;
        this.A01 = c5cs;
    }

    public C2xf(RichStatus richStatus, User user) {
        this.A01 = richStatus;
        this.A02 = user;
    }

    public boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2xf)) {
                    return false;
                }
                C2xf c2xf = (C2xf) obj;
                return c2xf.A00 == 0 && 11T.A0O(this.A01, c2xf.A01) && this.A02 == c2xf.A02;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2xf)) {
                    return false;
                }
                C2xf c2xf2 = (C2xf) obj;
                if (c2xf2.A00 != 1 || !11T.A0O(this.A01, c2xf2.A01)) {
                    return false;
                }
                obj2 = this.A02;
                obj3 = c2xf2.A02;
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2xf)) {
                    return false;
                }
                C2xf c2xf3 = (C2xf) obj;
                if (c2xf3.A00 != 2 || !11T.A0O(this.A02, c2xf3.A02)) {
                    return false;
                }
                obj2 = this.A01;
                obj3 = c2xf3.A01;
                break;
        }
        return 11T.A0O(obj2, obj3);
    }

    public int hashCode() {
        Object obj;
        int hashCode;
        int i;
        Object obj2;
        switch (this.A00) {
            case 0:
                obj = this.A01;
                if (obj == null) {
                    hashCode = 0;
                    i = hashCode * 31;
                    obj2 = this.A02;
                    break;
                }
                hashCode = obj.hashCode();
                i = hashCode * 31;
                obj2 = this.A02;
            case 1:
                obj = this.A01;
                hashCode = obj.hashCode();
                i = hashCode * 31;
                obj2 = this.A02;
                break;
            default:
                i = this.A02.hashCode() * 31;
                obj2 = this.A01;
                break;
        }
        return 1BK.A03(obj2, i);
    }

    public String toString() {
        if (this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FolderEmptyStateInterfaceModel(extraData=");
        sb.append(this.A01);
        sb.append(", folderName=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }
}
