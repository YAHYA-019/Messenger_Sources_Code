package X;

import android.os.Process;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlin.jvm.functions.Function1;

/* renamed from: X.2m2, reason: invalid class name */
/* loaded from: 2m2.class */
public final class C2m2 extends C00q implements Function1 {
    public final /* synthetic */ String $name;
    public final /* synthetic */ int $waitingOn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2m2(String str, int i) {
        super(1);
        this.$name = str;
        this.$waitingOn = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        java.util.Map map = (java.util.Map) obj;
        11T.A0F(map, 0);
        map.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.$name);
        map.put("threadPriority", Integer.valueOf(Process.getThreadPriority(Process.myTid())));
        map.put("waiting-on", Integer.valueOf(this.$waitingOn));
        return 04S.A00;
    }
}
