package X;

import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.state.gen.State;
import java.util.Iterator;

/* renamed from: X.3a3, reason: invalid class name */
/* loaded from: 3a3.class */
public final class C3a3 implements 2JM {
    public final int A00;
    public final Object A01;

    public C3a3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public String BGe() {
        return this.A00 != 0 ? "CallStatusBarFragmentController" : "VideoChatLinkSharedStateImpl";
    }

    public void C7K(2JS r302) {
        int i;
        int i2;
        if (this.A00 != 0) {
            11T.A0F(r302, 0);
            2JQ r0 = State.CONVERTER;
            11T.A0B(r0);
            State state = (State) r302.A01(r0);
            2QL r02 = (2QL) this.A01;
            int i3 = r02.A00;
            if ((i3 == 4 || i3 == 0) && (i = state.callState) != 4 && i != 0) {
                r02.A03.A0V.add(r02.A02);
            }
            int i4 = r02.A00;
            if (i4 != 4 && i4 != 0 && ((i2 = state.callState) == 4 || i2 == 0)) {
                2QL.A00(r02);
            }
            r02.A00 = state.callState;
            return;
        }
        CallModel callModel = (CallModel) r302.A02(CallModel.CONVERTER);
        boolean z = false;
        if (callModel == null) {
            2Qb r03 = (2Qb) this.A01;
            r03.A0I = false;
            r03.A0H = false;
            return;
        }
        boolean A0G = IFr.A0G(callModel);
        2Qb r04 = (2Qb) this.A01;
        if (A0G != r04.A0I) {
            r04.A0I = A0G;
            boolean BQN = ((2QO) r04.A0P.get()).BQN();
            int i5 = r04.A01;
            int i6 = callModel.inCallState;
            if (i5 != i6) {
                z = true;
            }
            if (BQN != r04.A0H || z) {
                r04.A0H = BQN;
                r04.A01 = i6;
                Iterator A00 = 2Qb.A00(r04);
                while (A00.hasNext()) {
                    A00.next();
                }
                2Qb.A03(r04);
            }
            String A0A = r04.A0A();
            boolean A0G2 = IFr.A0G((CallModel) ((2JN) r04.A0S.get()).A01().A02(CallModel.CONVERTER));
            if (r04.A0J || !A0G2 || 1JF.A0B(A0A) || !r04.A0R()) {
                return;
            }
            IFc.A06((IFc) r04.A0N.get(), "connected_to_media");
            r04.A0J = true;
        }
    }
}
