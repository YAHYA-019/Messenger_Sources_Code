package X;

import android.app.Dialog;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.cowatch.intent.model.CowatchShareModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cww.class */
public final class Cww implements AnonymousClass553 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public Cww(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A01 = obj6;
        this.A02 = obj3;
        this.A03 = obj;
        this.A04 = obj5;
        this.A05 = obj4;
        this.A06 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v198, types: [X.Dee, X.DMV, android.app.Dialog] */
    @Override // X.AnonymousClass553
    public final void onClick(View view) {
        int i;
        switch (this.A00) {
            case 0:
                11T.A0F(view, 0);
                1Iw r0 = (1Iw) this.A03;
                MigColorScheme migColorScheme = (MigColorScheme) this.A02;
                ThreadSummary threadSummary = (ThreadSummary) this.A06;
                CallerContext callerContext = (CallerContext) this.A01;
                06Z r02 = (06Z) this.A05;
                FbUserSession fbUserSession = (FbUserSession) this.A04;
                8Ca A01 = ((C9kp) 1Bn.A0A(67678)).A01(view, migColorScheme);
                LQD lqd = ((7QJ) A01).A04;
                11T.A0A(lqd);
                RF9 rf9 = new RF9((BaX) C1Y6.A00(r0.A0D, "com_facebook_messaging_communitymessaging_plugins_interfaces_manageinboxitemactions_ManageInboxItemActionsInterfaceSpec", "ActionItems", new Object[]{1vD.A00(view), r02, threadSummary, callerContext, fbUserSession}));
                Rer rer = rf9.A00.A00;
                AtomicInteger atomicInteger = C1Y6.A04;
                int andIncrement = atomicInteger.getAndIncrement();
                1YC r03 = rer.A05;
                String str = "com.facebook.messaging.communitymessaging.plugins.interfaces.manageinboxitemactions.ManageInboxItemActionsInterfaceSpec";
                r03.A08("com.facebook.messaging.communitymessaging.plugins.interfaces.manageinboxitemactions.ManageInboxItemActionsInterfaceSpec", "messaging.communitymessaging.manageinboxitemactions.ManageInboxItemActionsInterfaceSpec", "getManageChannelItems", andIncrement);
                try {
                    int i2 = rer.A00;
                    if (i2 == -1) {
                        i2 = Rer.A01(rer) ? 1 : 0;
                        if (Rer.A00(rer)) {
                            i2++;
                        }
                        rer.A00 = i2;
                    }
                    ArrayList A0t = AnonymousClass001.A0t(i2);
                    try {
                        if (Rer.A01(rer)) {
                            i = atomicInteger.getAndIncrement();
                            str = "messaging.communitymessaging.channelorganization.manageinboxitemactions.editchannelmanageitem.EditChannelManageItemImplementation";
                            r03.A0A("com.facebook.messaging.communitymessaging.plugins.channelorganization.manageinboxitemactions.editchannelmanageitem.EditChannelManageItemImplementation", str, "com.facebook.messaging.communitymessaging.plugins.interfaces.manageinboxitemactions.ManageInboxItemActionsInterfaceSpec", i, "messaging.communitymessaging.manageinboxitemactions.ManageInboxItemActionsInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.channelorganization.manageinboxitemactions.CommunitymessagingChannelorganizationManageinboxitemactionsKillSwitch", "getManageChannelItems");
                            try {
                                A0t.add(new RSu((C1p8) null, AbJ.A0y(rer.A02.A00, 2131956239), 1));
                                r03.A09(str, "messaging.communitymessaging.manageinboxitemactions.ManageInboxItemActionsInterfaceSpec", "getManageChannelItems", i);
                            } catch (Exception e) {
                                throw e;
                            }
                        }
                        if (Rer.A00(rer)) {
                            i = atomicInteger.getAndIncrement();
                            str = "messaging.communitymessaging.channelorganization.manageinboxitemactions.deletechannelmanageitem.DeleteChannelManageItemImplementation";
                            r03.A0A("com.facebook.messaging.communitymessaging.plugins.channelorganization.manageinboxitemactions.deletechannelmanageitem.DeleteChannelManageItemImplementation", str, "com.facebook.messaging.communitymessaging.plugins.interfaces.manageinboxitemactions.ManageInboxItemActionsInterfaceSpec", i, "messaging.communitymessaging.manageinboxitemactions.ManageInboxItemActionsInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.channelorganization.manageinboxitemactions.CommunitymessagingChannelorganizationManageinboxitemactionsKillSwitch", "getManageChannelItems");
                            A0t.add(new RSu(C1td.A0A, AbJ.A0y(rer.A01.A00, 2131955654), 2));
                            r03.A09(str, "messaging.communitymessaging.manageinboxitemactions.ManageInboxItemActionsInterfaceSpec", "getManageChannelItems", i);
                        }
                        while (true) {
                            int size = A0t.size();
                            int i3 = rer.A00;
                            if (i3 == -1) {
                                i3 = Rer.A01(rer) ? 1 : 0;
                                if (Rer.A00(rer)) {
                                    i3++;
                                }
                                rer.A00 = i3;
                            }
                            if (size >= i3) {
                                r03.A02((Exception) null, "messaging.communitymessaging.manageinboxitemactions.ManageInboxItemActionsInterfaceSpec", "getManageChannelItems", andIncrement);
                                Iterator it = A0t.iterator();
                                while (it.hasNext()) {
                                    RSu rSu = (RSu) it.next();
                                    String str2 = rSu.A02;
                                    11T.A0A(str2);
                                    C1p8 c1p8 = rSu.A01;
                                    if (c1p8 != null) {
                                        SpannableString spannableString = new SpannableString(str2);
                                        spannableString.setSpan(new ForegroundColorSpan(migColorScheme.Chx(c1p8)), 0, str2.length(), 18);
                                        str2 = spannableString;
                                    }
                                    lqd.add(0, rSu.A00, 0, str2);
                                }
                                ((7QJ) A01).A01 = new CZW(rf9, 0);
                                A01.A00();
                                return;
                            }
                            A0t.add(null);
                        }
                    } catch (Throwable th) {
                        r03.A04((Exception) null, str, "messaging.communitymessaging.manageinboxitemactions.ManageInboxItemActionsInterfaceSpec", "getManageChannelItems", i);
                        throw th;
                    }
                } catch (Throwable th2) {
                    r03.A02((Exception) null, "messaging.communitymessaging.manageinboxitemactions.ManageInboxItemActionsInterfaceSpec", "getManageChannelItems", andIncrement);
                    throw th2;
                }
            case 1:
                CDT cdt = (CDT) this.A06;
                Context context = (Context) this.A02;
                String A0u = 1BK.A0u(context, 2131964694);
                MigColorScheme migColorScheme2 = (MigColorScheme) this.A03;
                ?? c2125Dee = new C2125Dee(context, migColorScheme2.Aho());
                cdt.A00 = c2125Dee;
                c2125Dee.A04(A0u);
                6QF.A00((Dialog) c2125Dee);
                c2125Dee.show();
                CtF ctF = (CtF) this.A01;
                ListenableFuture A012 = ctF.A01(ImmutableList.of(this.A04));
                11T.A0D(A012);
                Executor A11 = 4YV.A11(cdt.A02);
                View view2 = (View) this.A05;
                1Kd.A0F(new S5d(context, context, view2, view2, cdt, ctF, migColorScheme2, migColorScheme2), A012, A11);
                return;
            default:
                C4E c4e = (C4E) this.A01;
                FbUserSession fbUserSession2 = (FbUserSession) this.A02;
                Object obj = this.A03;
                ThreadKey threadKey = (ThreadKey) this.A04;
                CowatchShareModel cowatchShareModel = (CowatchShareModel) this.A05;
                Object obj2 = this.A06;
                BsH bsH = (BsH) c4e.A01.get();
                String str3 = cowatchShareModel.A03;
                7zS.A16(0, fbUserSession2, threadKey, str3);
                BpR bpR = (BpR) 1Br.A0B(bsH.A02);
                String A0w = 1BK.A0w(threadKey);
                D4H d4h = new D4H(1, obj, obj2, bsH);
                GraphQlQueryParamSet A0M = 7zL.A0M();
                07S A0J = 4YU.A0J(GraphQlCallInput.A02, str3, "media_id");
                07S.A00(A0J, "fb", GOm.A00(1));
                07S.A00(A0J, A0w, "thread_id");
                4YV.A1A(A0J, A0M, "input");
                1Kd.A0D(bpR.A02, d4h, AbK.A0z(1VX.A07(bpR.A01, fbUserSession2), 5Dh.A00(A0M, new C01643sd(Q7n.class, "CoWatchSendXmaMutation", null, "input", "fbandroid", -1420751544, 32, 2256237713L, 2256237713L, false, true)), 1055339481777596L));
                return;
        }
    }
}
