package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.selfremediation.block.user.BlockUserFragment;
import com.facebook.rsys.camera.gen.CameraModel;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import java.util.concurrent.ExecutionException;

/* loaded from: Cjs.class */
public final class Cjs implements AnonymousClass477 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Cjs(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, X.0CL] */
    @Override // X.AnonymousClass477
    public void COj(User user) {
        switch (this.A00) {
            case 0:
                11T.A0F(user, 0);
                CEI cei = (CEI) this.A02;
                I8C i8c = (I8C) 1Br.A0B(cei.A03);
                FbUserSession fbUserSession = (FbUserSession) this.A01;
                1BY r0 = i8c.A01.A00;
                BlockUserFragment blockUserFragment = null;
                2JS A01 = ((2JN) 1Lo.A04((Context) null, fbUserSession, r0, 33088)).A01();
                2JQ r02 = CameraModel.CONVERTER;
                11T.A0B(r02);
                CameraModel cameraModel = (CameraModel) A01.A02(r02);
                boolean z = cameraModel != null ? cameraModel.cameraOn : false;
                I8C.A00(fbUserSession, i8c, z);
                ?? obj = new Object();
                2Qa r03 = (2Qa) 1Lo.A04((Context) null, fbUserSession, r0, 33089);
                Cp8 cp8 = new Cp8(obj, r03, 0);
                r03.A02(cp8);
                7EN r04 = (7EN) 1Bn.A0E((Context) null, r0, 50188);
                CwF cwF = new CwF(i8c, z);
                BNT bnt = BNT.A0U;
                BNJ bnj = BNJ.A0B;
                GR0 gr0 = ((HuL) 1Br.A0B(i8c.A02)).A02;
                if (gr0 == null) {
                    11T.A0L("fragmentManagerProvider");
                    throw 0Q8.createAndThrow();
                }
                06Z A00 = gr0.A00();
                if (A00 == null) {
                    throw 1BK.A0h();
                }
                CwE cwE = new CwE(i8c, cp8, r03, z);
                if (A00.A0b("BlockUserFragment") == null) {
                    if (7EN.A02((ThreadSummary) null, r04, user)) {
                        7EN.A00(A00, 1Fw.A05(r04.A00), (ThreadSummary) null, bnt, bnj, r04, cwF, user);
                    } else {
                        BlockUserFragment A06 = BlockUserFragment.A06(bnt, bnj, user);
                        A06.A07 = cwE;
                        A06.A06 = null;
                        A06.A0m(A00, "BlockUserFragment");
                        blockUserFragment = A06;
                    }
                }
                ((0CL) obj).element = blockUserFragment;
                if (blockUserFragment == null) {
                    r03.A03(cp8);
                }
                CEI.A00(fbUserSession, cei);
                return;
            case 1:
                11T.A0F(user, 0);
                java.util.Map map = (java.util.Map) this.A01;
                UserKey userKey = ((CJ5) this.A02).A00;
                if (userKey == null) {
                    throw 1BK.A0h();
                }
                Name name = user.A0X;
                11T.A0A(name);
                map.put(userKey, name);
                return;
            default:
                Ctm ctm = (Ctm) this.A01;
                try {
                    ((6HS) ctm.A0C.get()).A07((ThreadKey) ((CNa) 1Bn.A0E(1BK.A04(ctm.A09), (1BY) null, 82461)).A03(ctm.A01, user, false).get(), "broadcast_flow");
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    0fH.A0w("SendButtonStateEnvironment", "Getting thread key failed", e);
                    ((6HS) ctm.A0C.get()).A07((ThreadKey) this.A02, "broadcast_flow");
                    return;
                }
        }
    }

    @Override // X.AnonymousClass477
    public void onFailure(Throwable th) {
        4zJ r306;
        Object[] objArr;
        String str;
        switch (this.A00) {
            case 0:
                11T.A0F(th, 0);
                r306 = 4zI.A03;
                objArr = new Object[]{th};
                str = "BlockedParticipantAddedDialogCreator";
                break;
            case 1:
                11T.A0F(th, 0);
                r306 = 4zI.A03;
                objArr = new Object[]{th};
                str = "SafetyWarningControllerImpl";
                break;
            default:
                0fH.A0w("SendButtonStateEnvironment", "Fetch user by userKey failed", th);
                ((6HS) ((Ctm) this.A01).A0C.get()).A07((ThreadKey) this.A02, "broadcast_flow");
                return;
        }
        r306.A09(str, "Failed to fetch user", objArr);
    }
}
