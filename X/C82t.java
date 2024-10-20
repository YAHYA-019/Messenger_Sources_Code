package X;

import com.facebook.messaging.composer.avatar.StickerSuggestionsController;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import kotlin.jvm.functions.Function2;

/* renamed from: X.82t, reason: invalid class name */
/* loaded from: 82t.class */
public final class C82t extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82t(StickerSuggestionsController stickerSuggestionsController, ThreadKey threadKey, 0DR r304) {
        super(2, r304);
        this.A04 = 0;
        this.A01 = threadKey;
        this.A03 = stickerSuggestionsController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82t(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, 0DR r303) {
        super(2, r303);
        this.A04 = 2;
        this.A03 = inAppPurchaseControllerCoro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82t(Object obj, Object obj2, 0DR r304, int i) {
        super(2, r304);
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82t(Object obj, Object obj2, Object obj3, 0DR r305, int i) {
        super(2, r305);
        this.A04 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        Object obj6;
        int i2;
        Object obj7;
        Object obj8;
        int i3;
        C82t c82t;
        switch (this.A04) {
            case 0:
                C82t c82t2 = new C82t((StickerSuggestionsController) this.A03, (ThreadKey) this.A01, r303);
                c82t2.A02 = obj;
                return c82t2;
            case 1:
                obj2 = this.A03;
                obj4 = this.A02;
                obj3 = this.A01;
                i = 1;
                return new C82t(obj2, obj4, obj3, r303, i);
            case 2:
                return new C82t((InAppPurchaseControllerCoro) this.A03, r303);
            case 3:
                obj2 = this.A03;
                obj3 = this.A01;
                obj4 = this.A02;
                i = 3;
                return new C82t(obj2, obj4, obj3, r303, i);
            case 4:
                obj5 = this.A01;
                obj6 = this.A02;
                i2 = 4;
                c82t = new C82t(obj5, obj6, r303, i2);
                c82t.A03 = obj;
                return c82t;
            case 5:
                obj5 = this.A01;
                obj6 = this.A02;
                i2 = 5;
                c82t = new C82t(obj5, obj6, r303, i2);
                c82t.A03 = obj;
                return c82t;
            case 6:
                obj7 = this.A02;
                obj8 = this.A01;
                i3 = 6;
                c82t = new C82t(obj8, obj7, r303, i3);
                c82t.A03 = obj;
                return c82t;
            case 7:
                obj5 = this.A01;
                obj6 = this.A02;
                i2 = 7;
                c82t = new C82t(obj5, obj6, r303, i2);
                c82t.A03 = obj;
                return c82t;
            default:
                obj7 = this.A02;
                obj8 = this.A01;
                i3 = 8;
                c82t = new C82t(obj8, obj7, r303, i3);
                c82t.A03 = obj;
                return c82t;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x05c9, code lost:
    
        if (r309 != r306) goto L132;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
