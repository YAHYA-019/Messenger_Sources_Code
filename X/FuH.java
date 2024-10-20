package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.List;

/* loaded from: FuH.class */
public final class FuH implements InterfaceC01783sv {
    public final /* synthetic */ EgR A00;

    public FuH(EgR egR) {
        this.A00 = egR;
    }

    /* JADX WARN: Type inference failed for: r304v3, types: [java.lang.Object, X.ETV] */
    @Override // X.InterfaceC01783sv
    public Object D4r(Object[] objArr) {
        EgR egR = this.A00;
        Object obj = objArr[1];
        String str = (String) objArr[2];
        if (str != null) {
            EmZ emZ = egR.A00;
            ExH exH = emZ.A01;
            FbUserSession fbUserSession = emZ.A00;
            String str2 = emZ.A02;
            exH.A00.get();
            Object obj2 = null;
            4Yu A00 = ((5SL) 1Lo.A06(fbUserSession, 49727)).A00(str, str2, (List) null);
            obj = obj2;
            if (A00 != null) {
                String str3 = A00.A02;
                obj = obj2;
                if (!EYA.A00(str3)) {
                    long j = A00.A01;
                    String str4 = A00.A03;
                    int i = A00.A00;
                    ?? obj3 = new Object();
                    ((ETV) obj3).A01 = j;
                    ((ETV) obj3).A02 = str3;
                    ((ETV) obj3).A03 = str4;
                    ((ETV) obj3).A00 = i;
                    obj = obj3;
                }
            }
        }
        return obj;
    }
}
