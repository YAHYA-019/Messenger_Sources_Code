package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.messaging.business.share.model.MessengerPlatformExtensibleShareContentFields;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.PlatformExtensionShareIntentModel;
import java.util.concurrent.ExecutionException;

/* loaded from: Ctg.class */
public final class Ctg implements DHZ {
    public 1BY A00;
    public final C00i A01 = 7zN.A0D(82105);

    public Ctg(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public Class BDh() {
        return PlatformExtensionShareIntentModel.class;
    }

    public /* bridge */ /* synthetic */ CDU BYN(BroadcastFlowIntentModel broadcastFlowIntentModel) {
        Integer num;
        PlatformExtensionShareIntentModel platformExtensionShareIntentModel = (PlatformExtensionShareIntentModel) broadcastFlowIntentModel;
        MessengerPlatformExtensibleShareContentFields messengerPlatformExtensibleShareContentFields = platformExtensionShareIntentModel.A00;
        Throwable e = null;
        if (messengerPlatformExtensibleShareContentFields != null) {
            if (1JF.A0B(messengerPlatformExtensibleShareContentFields.A08)) {
                String str = messengerPlatformExtensibleShareContentFields.A03;
                if (!1JF.A0B(str) || !1JF.A0B(messengerPlatformExtensibleShareContentFields.A0B)) {
                    try {
                        BkU bkU = (BkU) this.A01.get();
                        C30G A0H = AbF.A0H(38);
                        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, 4YT.A00(108));
                        07S.A00(A0J, messengerPlatformExtensibleShareContentFields.A0E, "page_id");
                        07S.A00(A0J, messengerPlatformExtensibleShareContentFields.A0B, "url");
                        07S.A00(A0J, messengerPlatformExtensibleShareContentFields.A0A, "media_type");
                        4YV.A1A(A0J, ((2Jf) A0H).A00, "params");
                        C3sa A0L = AbK.A0L(A0H);
                        A0L.A0B = false;
                        AbstractC05414dq A05 = 1VX.A05(bkU.A00, AbK.A0D(bkU.A01.A00));
                        4YU.A1J(A0L, 606440390061697L);
                        MessengerPlatformExtensibleShareContentFields messengerPlatformExtensibleShareContentFields2 = (MessengerPlatformExtensibleShareContentFields) 2FP.A01(D3J.A01(messengerPlatformExtensibleShareContentFields, 1), A05.A03(A0L)).get();
                        if (messengerPlatformExtensibleShareContentFields2 != null) {
                            platformExtensionShareIntentModel.A00 = messengerPlatformExtensibleShareContentFields2;
                            return new CDU(new Ct1(messengerPlatformExtensibleShareContentFields2.A08, messengerPlatformExtensibleShareContentFields2.A0I, messengerPlatformExtensibleShareContentFields2.A0G, messengerPlatformExtensibleShareContentFields2.A0H, null));
                        }
                    } catch (InterruptedException | ExecutionException e2) {
                        e = e2;
                    }
                    num = 0S2.A00;
                }
            }
            return new CDU(new Ct1(messengerPlatformExtensibleShareContentFields.A08, messengerPlatformExtensibleShareContentFields.A0I, messengerPlatformExtensibleShareContentFields.A0G, messengerPlatformExtensibleShareContentFields.A0H, null));
        }
        num = 0S2.A01;
        return new CDU(num, e);
    }
}
