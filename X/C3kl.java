package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlin.jvm.functions.Function1;

/* renamed from: X.3kl, reason: invalid class name */
/* loaded from: 3kl.class */
public final class C3kl extends C00q implements Function1 {
    public final /* synthetic */ boolean $isNullState = true;
    public final /* synthetic */ int $numberOfStories = 0;
    public final /* synthetic */ 2R0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3kl(2R0 r302) {
        super(1);
        this.this$0 = r302;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0D7 r0 = (0D7) obj;
        11T.A0F(r0, 0);
        boolean z = this.$isNullState;
        int i = this.$numberOfStories;
        0DA r02 = new 0DA();
        r02.A06("num_items", 1BK.A0l(i));
        r0.A0A(r02, "unit_info");
        if (z) {
            0DA r03 = new 0DA();
            r03.A02(new 0DA(), "ids");
            r03.A01(2R7.A0G, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            r0.A0A(r03, "item_container");
        }
        return r0;
    }
}
