package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.68r, reason: invalid class name */
/* loaded from: 68r.class */
public abstract class C68r extends 4DO {
    public transient String A00;
    public final Collection _propertyIds;
    public final String _propertyName;
    public final Class _referringClass;

    /* JADX WARN: Multi-variable type inference failed */
    public C68r(4DN r302, AbstractC01033pi abstractC01033pi, Class cls, String str, String str2, Collection collection) {
        super(str, null);
        ((2LD) this)._location = r302;
        this.A00 = abstractC01033pi;
        this._referringClass = cls;
        this._propertyName = str2;
        this._propertyIds = collection;
    }

    public String A07() {
        Collection collection;
        String str = this.A00;
        if (str == null && (collection = this._propertyIds) != null) {
            StringBuilder sb = new StringBuilder(100);
            int size = collection.size();
            if (size != 1) {
                sb.append(" (");
                sb.append(size);
                sb.append(" known properties: ");
                Iterator it = this._propertyIds.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append('\"');
                    sb.append(String.valueOf(it.next()));
                    sb.append('\"');
                    if (sb.length() > 1000) {
                        sb.append(" [truncated]");
                        break;
                    }
                    if (it.hasNext()) {
                        sb.append(", ");
                    }
                }
            } else {
                sb.append(" (one known property: \"");
                sb.append(String.valueOf(this._propertyIds.iterator().next()));
                sb.append('\"');
            }
            sb.append("])");
            str = sb.toString();
            this.A00 = str;
        }
        return str;
    }
}
