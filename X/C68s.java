package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.io.Serializable;

/* renamed from: X.68s, reason: invalid class name */
/* loaded from: 68s.class */
public final class C68s implements Serializable {
    public static final long serialVersionUID = 2;
    public transient Object A00;
    public String _desc;
    public String _fieldName;
    public int _index = -1;

    private String A00() {
        char c;
        String str = this._desc;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            Object obj = this.A00;
            if (obj != null) {
                Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                int i = 0;
                while (cls.isArray()) {
                    cls = cls.getComponentType();
                    i++;
                }
                String name = cls.getName();
                while (true) {
                    sb.append(name);
                    i--;
                    if (i < 0) {
                        break;
                    }
                    name = "[]";
                }
            } else {
                sb.append(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
            }
            sb.append('[');
            String str2 = this._fieldName;
            if (str2 != null) {
                c = '\"';
                sb.append('\"');
                sb.append(str2);
            } else {
                int i2 = this._index;
                if (i2 >= 0) {
                    sb.append(i2);
                    sb.append(']');
                    str = sb.toString();
                    this._desc = str;
                } else {
                    c = '?';
                }
            }
            sb.append(c);
            sb.append(']');
            str = sb.toString();
            this._desc = str;
        }
        return str;
    }

    public String toString() {
        return A00();
    }

    public Object writeReplace() {
        A00();
        return this;
    }
}
