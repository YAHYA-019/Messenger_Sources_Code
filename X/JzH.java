package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: JzH.class */
public final class JzH extends C28j implements Serializable {
    public static final long serialVersionUID = 3;
    public HashMap _classMappings = null;
    public HashMap _interfaceMappings = null;
    public boolean _hasEnumSerializer = false;

    private JsonSerializer A00(Liw liw, Class cls) {
        JsonSerializer jsonSerializer;
        Class<?>[] interfaces = cls.getInterfaces();
        int length = interfaces.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                jsonSerializer = null;
                break;
            }
            Class<?> cls2 = interfaces[i2];
            Liw.A00(liw, cls2);
            jsonSerializer = (JsonSerializer) this._interfaceMappings.get(liw);
            if (jsonSerializer != null) {
                break;
            }
            jsonSerializer = A00(liw, cls2);
            if (jsonSerializer != null) {
                break;
            }
            i = i2 + 1;
        }
        return jsonSerializer;
    }

    @Override // X.C28j
    public JsonSerializer ASW(JsonSerializer jsonSerializer, C25p c25p, AnonymousClass251 anonymousClass251, C4Nr c4Nr, C42k c42k) {
        return ASy(c42k, c25p, anonymousClass251);
    }

    @Override // X.C28j
    public JsonSerializer ASd(JsonSerializer jsonSerializer, C25p c25p, AnonymousClass251 anonymousClass251, C4Nr c4Nr, C31a c31a) {
        return ASy(c31a, c25p, anonymousClass251);
    }

    @Override // X.C28j
    public JsonSerializer ASe(JsonSerializer jsonSerializer, C25p c25p, AnonymousClass251 anonymousClass251, C4Nr c4Nr, 3Bw r306) {
        return ASy(r306, c25p, anonymousClass251);
    }

    @Override // X.C28j
    public JsonSerializer ASr(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, C25p c25p, AnonymousClass251 anonymousClass251, C4Nr c4Nr, C4E7 c4e7) {
        return ASy(c4e7, c25p, anonymousClass251);
    }

    @Override // X.C28j
    public JsonSerializer ASs(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, C25p c25p, AnonymousClass251 anonymousClass251, C4Nr c4Nr, C4E6 c4e6) {
        return ASy(c4e6, c25p, anonymousClass251);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r308 != null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010f A[ORIG_RETURN, RETURN] */
    @Override // X.C28j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer ASy(X.24S r302, X.C25p r303, X.AnonymousClass251 r304) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JzH.ASy(X.24S, X.25p, X.251):com.fasterxml.jackson.databind.JsonSerializer");
    }
}
