package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.2cb, reason: invalid class name */
/* loaded from: 2cb.class */
public class C2cb extends C2cc {
    public static final long serialVersionUID = 3;
    public transient Closeable A00;
    public LinkedList _path;

    public C2cb(Closeable closeable, String str) {
        super(str);
        this.A00 = closeable;
        if (closeable instanceof AbstractC01033pi) {
            ((2LD) this)._location = ((AbstractC01033pi) closeable).A1D();
        }
    }

    public C2cb(Closeable closeable, String str, Throwable th) {
        super(str, th);
        4DN A1D;
        ((2LD) this)._location = null;
        this.A00 = closeable;
        if (th instanceof 2LE) {
            A1D = ((2LE) th)._location;
        } else if (!(closeable instanceof AbstractC01033pi)) {
            return;
        } else {
            A1D = ((AbstractC01033pi) closeable).A1D();
        }
        ((2LD) this)._location = A1D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C2cb A00(C68s c68s, Throwable th) {
        C2cb c2cb;
        if (th instanceof C2cb) {
            c2cb = (C2cb) th;
        } else {
            String A09 = 27C.A09(th);
            if (A09 == null || A09.isEmpty()) {
                A09 = 0Pz.A0j("(was ", AnonymousClass001.A0Y(th), ")");
            }
            Closeable closeable = null;
            if (th instanceof 2LE) {
                Object A05 = ((2LE) th).A05();
                if (A05 instanceof Closeable) {
                    closeable = (Closeable) A05;
                }
            }
            c2cb = new C2cb(closeable, A09, th);
        }
        LinkedList linkedList = c2cb._path;
        if (linkedList == null) {
            linkedList = new LinkedList();
            c2cb._path = linkedList;
        }
        if (linkedList.size() < 1000) {
            linkedList.addFirst(c68s);
        }
        return c2cb;
    }

    public static C2cb A01(IOException iOException) {
        return new C2cb(null, String.format("Unexpected IOException (of type %s): %s", AnonymousClass001.A0Y(iOException), 27C.A09(iOException)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.68s, java.lang.Object] */
    public static C2cb A02(Object obj, String str, Throwable th) {
        ?? obj2 = new Object();
        obj2._index = -1;
        obj2.A00 = obj;
        if (str == null) {
            throw AnonymousClass001.A0Q("Cannot pass null fieldName");
        }
        obj2._fieldName = str;
        return A00(obj2, th);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.68s, java.lang.Object] */
    public static C2cb A03(Object obj, Throwable th, int i) {
        ?? obj2 = new Object();
        obj2.A00 = obj;
        obj2._index = i;
        return A00(obj2, th);
    }

    public static String A04(C2cb c2cb) {
        String message = super.getMessage();
        LinkedList linkedList = c2cb._path;
        if (linkedList != null) {
            StringBuilder A0k = message == null ? AnonymousClass001.A0k() : new StringBuilder(message);
            A0k.append(" (through reference chain: ");
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                A0k.append(it.next().toString());
                if (it.hasNext()) {
                    A0k.append("->");
                }
            }
            A0k.append(')');
            message = A0k.toString();
        }
        return message;
    }

    public String getLocalizedMessage() {
        return A04(this);
    }

    public String getMessage() {
        return A04(this);
    }
}
