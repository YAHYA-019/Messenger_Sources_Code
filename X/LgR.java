package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: LgR.class */
public final class LgR implements 5xY, Cloneable {
    public static final LgR A02 = new LgR();
    public List A01 = Collections.emptyList();
    public List A00 = Collections.emptyList();

    public static boolean A00(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public /* bridge */ /* synthetic */ Object clone() {
        Object clone;
        try {
            clone = super.clone();
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw AnonymousClass001.A0J(clone);
        }
    }

    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        if (A00(typeToken.rawType)) {
            return new KDd(gson, this, typeToken);
        }
        Iterator it = this.A01.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("shouldSkipClass");
        }
        Iterator it2 = this.A00.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        it2.next();
        throw AnonymousClass001.A0Q("shouldSkipClass");
    }
}
