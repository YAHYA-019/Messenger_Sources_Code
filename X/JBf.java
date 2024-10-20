package X;

import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.state.gen.State;

/* loaded from: JBf.class */
public final class JBf extends C00q implements C0Bd {
    public final /* synthetic */ 2JS $activeCallAppModel;
    public final /* synthetic */ String $multiCallLocalCallId;
    public final /* synthetic */ HzW this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JBf(2JS r302, HzW hzW, String str) {
        super(3);
        this.this$0 = hzW;
        this.$multiCallLocalCallId = str;
        this.$activeCallAppModel = r302;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        State state = (State) obj3;
        if (state != null && (state.isActive || (i = state.callState) == 4 || i == 0)) {
            HzW hzW = this.this$0;
            String str = this.$multiCallLocalCallId;
            2JS r0 = this.$activeCallAppModel;
            11T.A0F(r0, 0);
            HzW.A00((CallModel) null, hzW, str, GOq.A0m(r0).localCallId);
            C00m c00m = this.this$0.A01;
            if (c00m != null) {
                c00m.invoke();
            }
            this.this$0.A01 = null;
        }
        return 04S.A00;
    }
}
