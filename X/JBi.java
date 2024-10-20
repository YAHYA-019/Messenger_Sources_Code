package X;

import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.ended.gen.EndedModel;
import com.facebook.rsys.state.gen.State;
import kotlin.jvm.functions.Function1;

/* loaded from: JBi.class */
public final class JBi extends C00q implements C0Bd {
    public static final JBi A00 = new JBi();

    public JBi() {
        super(3);
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Function1 function1;
        Object gvh;
        IDO ido;
        String str;
        String str2;
        5Vt r0 = (5Vs) obj;
        Function1 function12 = (Function1) obj2;
        11T.A0H(r0, function12);
        11T.A0F(obj3, 2);
        5Vt r02 = r0;
        HXS A002 = HK1.A00(r02);
        if (!A002.A00 && (obj3 instanceof 2JS)) {
            2JS r03 = (2JS) obj3;
            State A0m = GOq.A0m(r03);
            boolean z = true;
            if (A0m.callState == 4) {
                11T.A0F(r03, 0);
                EndedModel A0l = GOq.A0l(r03);
                function1 = r02.A00;
                if (A0l == null || A0l.reason != 0) {
                    z = false;
                }
                gvh = new Gvj(z);
            } else {
                if (A0m.isActive) {
                    11T.A0F(r03, 0);
                    CallModel A0j = GOq.A0j(r03);
                    if (A0j != null && A0j.inCallState == 2 && (A002 instanceof Gvk)) {
                        function1 = r02.A00;
                        gvh = Gvm.A00;
                    }
                }
                if (A002 instanceof Gvn) {
                    State A0m2 = GOq.A0m(r03);
                    if (A0m2.isActive) {
                        function1 = r02.A00;
                        gvh = Gvl.A00;
                    } else if (A0m2.callState == 2) {
                        11T.A0F(r03, 0);
                        CallModel A0j2 = GOq.A0j(r03);
                        if (A0j2 == null || A0j2.inCallState != 2) {
                            ido = IDO.A00;
                            StringBuilder A0k = AnonymousClass001.A0k();
                            A0k.append("Received inactive IN_CALL models that aren't incoming ringing. InCallState: ");
                            str2 = AnonymousClass001.A0a(A0j2 != null ? Integer.valueOf(A0j2.inCallState) : null, A0k);
                            str = "MultiCallMiddleware";
                            ido.A03(str, str2, (Throwable) null);
                        } else {
                            function1 = r02.A00;
                            gvh = Gvk.A00;
                        }
                    }
                } else if ((A002 instanceof Gvk) || (A002 instanceof Gvi)) {
                    11T.A0F(r03, 0);
                    CallModel A0j3 = GOq.A0j(r03);
                    if (A0j3 == null) {
                        if (A002 instanceof Gvi) {
                            ido = IDO.A00;
                            str = "MultiCallMiddleware";
                            str2 = "MultiCallState.Answering with null CallModel";
                            ido.A03(str, str2, (Throwable) null);
                        }
                    } else if (A0j3.inCallState > 2) {
                        function1 = r02.A00;
                        gvh = new Gvh(A0j3.inviteRequestedVideo);
                    }
                } else {
                    IDO.A00.A04("MultiCallMiddleware", AnonymousClass001.A0Z(A002, "Unhandled MultiCallState: ", AnonymousClass001.A0k()), (Throwable) null);
                }
            }
            function1.invoke(gvh);
        }
        return function12.invoke(obj3);
    }
}
