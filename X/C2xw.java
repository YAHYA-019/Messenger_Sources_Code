package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.Mailbox;

/* renamed from: X.2xw, reason: invalid class name */
/* loaded from: 2xw.class */
public final class C2xw extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2xw(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                22W.A00((FbUserSession) this.A01, (22W) this.A03, (Mailbox) this.A02);
                return 04S.A00;
            case 1:
                return new 5eE((Context) this.A01, (06Z) this.A03, (2MA) this.A02);
            case 2:
                final Context context = (Context) this.A01;
                final FbUserSession fbUserSession = (FbUserSession) this.A02;
                final 2SI r0 = (2SI) this.A03;
                return new C2nj(context, fbUserSession, r0) { // from class: X.2nv
                    public final C01i A00;
                    public final AnonymousClass207 A01;

                    {
                        11T.A0F(context, 1);
                        11T.A0F(fbUserSession, 2);
                        11T.A0F(r0, 3);
                        this.A00 = C01g.A01(new C2xw(7, context, r0, fbUserSession));
                        this.A01 = C2nw.A03;
                    }

                    @Override // X.C2nj
                    public AnonymousClass207 Asi() {
                        return this.A01;
                    }

                    @Override // X.C2nj
                    public /* bridge */ /* synthetic */ C2f1 AxT(ThreadSummary threadSummary) {
                        boolean z;
                        Object obj;
                        11T.A0F(threadSummary, 0);
                        C01i c01i = this.A00;
                        Object value = ((2oA) c01i.getValue()).A00.getValue();
                        11T.A0A(value);
                        2oE r02 = (2oE) value;
                        0Da r03 = 2mH.A01;
                        String BFw = r02.A00.A00.BFw(r03, threadSummary);
                        C2nw c2nw = null;
                        if (BFw != null) {
                            Object value2 = ((2oA) c01i.getValue()).A00.getValue();
                            11T.A0A(value2);
                            C2xe BFx = ((2oE) value2).A00.A00.BFx(r03, threadSummary);
                            boolean z2 = false;
                            if (BFx != null) {
                                z = BFx.A02;
                                obj = BFx.A01;
                            } else {
                                z = false;
                                obj = null;
                            }
                            if (obj == 0S2.A01) {
                                z2 = true;
                            }
                            if (!0CU.A0O(BFw)) {
                                c2nw = new C2nw(BFw, z, z2);
                            }
                        }
                        return c2nw;
                    }
                };
            case 3:
                C2ob c2ob = new C2ob();
                C2ov c2ov = new C2ov();
                Object obj = this.A03;
                Object obj2 = this.A02;
                Object obj3 = this.A01;
                new C83d(1, obj3, obj, obj2).invoke(c2ob);
                new 83U(obj3, obj, 32).invoke(c2ov);
                return new C2on(new C2oy(c2ov), new C2oi(c2ob));
            case 4:
                2SI r02 = (2SI) this.A03;
                11T.A0F(r02, 0);
                String str = 2SK.A00(r02).threadMetadataProviderRegistry;
                if (str != null) {
                    return new 2nO((2nL) C1Y6.A00((Context) this.A01, "com_facebook_messaging_threadlist_plugins_interfaces_threadmetadataprovider_ThreadMetadataProviderInterfaceSpec", str, new Object[]{this.A02, r02}));
                }
                throw AnonymousClass002.A0D(" does not yet support this plugin interface.", 1BL.A0w(r02));
            case 5:
                2SI r03 = (2SI) this.A03;
                11T.A0F(r03, 0);
                String str2 = 2SK.A00(r03).threadNameRegistry;
                if (str2 != null) {
                    return new 2mG((2mD) C1Y6.A00((Context) this.A01, "com_facebook_messaging_threadlist_plugins_interfaces_threadname_ThreadNameInterfaceSpec", str2, new Object[]{this.A02}));
                }
                throw AnonymousClass002.A0D(" does not yet support this plugin interface.", 1BL.A0w(r03));
            case 6:
                2SI r04 = (2SI) this.A03;
                11T.A0F(r04, 0);
                String str3 = 2SK.A00(r04).threadSnippetRegistry;
                if (str3 != null) {
                    return new 2mS((2mP) C1Y6.A00((Context) this.A01, "com_facebook_messaging_threadlist_plugins_interfaces_threadsnippet_ThreadSnippetInterfaceSpec", str3, new Object[]{this.A02}));
                }
                throw AnonymousClass002.A0D(" does not yet support this plugin interface.", 1BL.A0w(r04));
            case 7:
                return new 2oA((Context) this.A01, (FbUserSession) this.A02, (2SI) this.A03);
            default:
                2SI r05 = (2SI) this.A03;
                11T.A0F(r05, 0);
                String str4 = 2SK.A00(r05).threadTimestampRegistry;
                if (str4 != null) {
                    return new 2oE((2oB) C1Y6.A00((Context) this.A01, "com_facebook_messaging_threadlist_plugins_interfaces_threadtimestamp_ThreadTimestampInterfaceSpec", str4, new Object[]{this.A02}));
                }
                throw AnonymousClass002.A0D(" does not yet support this plugin interface.", 1BL.A0w(r05));
        }
    }
}
