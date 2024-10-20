package X;

import com.facebook.messaging.encryptedbackups.blockstore.setup.BlockStoreSetupManager;
import com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.facebook.presence.note.ui.consumption.reactions.NotesReactionsManager;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;

/* loaded from: AIa.class */
public final class AIa extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;
    public final Object A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIa(Object obj, 0DR r303, int i) {
        super(r303);
        this.A07 = i;
        this.A08 = obj;
    }

    public static Object A01(Object obj, AIa aIa) {
        aIa.A06 = obj;
        aIa.A00 |= (-1) << (-1);
        return aIa.A08;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (((X.AIa) r302).A07 != r301) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(int r301, java.lang.Object r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof X.AIa
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r302
            X.AIa r0 = (X.AIa) r0
            r302 = r0
            r0 = r302
            int r0 = r0.A07
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r301
            if (r0 == r1) goto L1c
        L1a:
            r0 = 0
            r303 = r0
        L1c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIa.A02(int, java.lang.Object):boolean");
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A07;
        Object A01 = A01(obj, this);
        switch (i) {
            case 0:
                return ((BlockStoreSetupManager) A01).A03(null, null, this, null);
            case 1:
                return EbPasskeySetupApi.A00(null, null, (EbPasskeySetupApi) A01, null, this);
            case 2:
                return InAppPurchaseControllerCoro.A02((InAppPurchaseControllerCoro) A01, null, null, this);
            case 3:
                return NotesReactionsManager.A00((NotesReactionsManager) A01, null, this);
            case 4:
                return ((AI1) A01).emit(null, this);
            default:
                return WriteSuggestionsRepository.A00((WriteSuggestionsRepository) A01, null, null, this);
        }
    }
}
