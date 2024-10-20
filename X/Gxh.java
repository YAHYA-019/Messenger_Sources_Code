package X;

import com.facebook.rsys.mediastats.gen.AudioLevelsCallback;
import com.google.common.util.concurrent.SettableFuture;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: Gxh.class */
public final class Gxh extends AudioLevelsCallback {
    public final /* synthetic */ SettableFuture A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ java.util.Map A02;

    public Gxh(SettableFuture settableFuture, List list, java.util.Map map) {
        this.A01 = list;
        this.A00 = settableFuture;
        this.A02 = map;
    }

    @Override // com.facebook.rsys.mediastats.gen.AudioLevelsCallback
    public void complete(java.util.Map map) {
        short s;
        Number A0o;
        11T.A0F(map, 0);
        LinkedHashMap A1C = 1BK.A1C();
        List list = this.A01;
        java.util.Map map2 = this.A02;
        for (Object obj : list) {
            Object obj2 = map2.get(obj);
            if (obj2 == null || (A0o = 1BK.A0o(obj2, map)) == null) {
                11T.A0D(obj);
                s = -1;
            } else {
                11T.A0D(obj);
                s = (short) A0o.intValue();
            }
            A1C.put(obj, Short.valueOf(s));
        }
        this.A00.set(A1C);
    }
}
