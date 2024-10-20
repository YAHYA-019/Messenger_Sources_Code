package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel;
import com.facebook.messaging.encryptedbackups.hsm.reminder.fragment.PinReminderFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.2aw, reason: invalid class name */
/* loaded from: 2aw.class */
public final class C2aw implements 1Vf {
    public 1PA A00;
    public final Context A02;
    public final 1Br A04;
    public final 1Br A03 = 1Bq.A00(65997);
    public boolean A01 = true;

    public C2aw(Context context) {
        this.A02 = context;
        this.A04 = 1HG.A00(context, 65728);
    }

    public static final void A00(FragmentActivity fragmentActivity, C2aw c2aw) {
        C1ud c1ud = (C1ud) 1Br.A0B(c2aw.A03);
        if (C1ud.A00(c1ud).AZr(c1ud.A02, 36316426694895635L)) {
            06Z BDe = fragmentActivity.BDe();
            11T.A0A(BDe);
            if (BDe.A0b("PinReminderFragment") == null) {
                new PinReminderFragment().A0m(fragmentActivity.BDe(), "PinReminderFragment");
            } else {
                0fH.A0l("EbLifecycleEventHandler", "Pin reminder already shown");
            }
        }
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        final FragmentActivity fragmentActivity;
        String str2;
        String str3;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        int hashCode = str.hashCode();
        if (hashCode != -1261602635) {
            if (hashCode != -1027586847) {
                if (hashCode == 1942735149 && str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible")) {
                    0fH.A0j("EbLifecycleEventHandler", "onInboxVisible");
                    Context context = this.A02;
                    if (!(context instanceof FragmentActivity) || (fragmentActivity = (FragmentActivity) context) == null) {
                        return;
                    }
                    FbUserSession A05 = ((1Fv) 1Bi.A03(66351)).A05(fragmentActivity);
                    final C2ax c2ax = (C2ax) 1Lm.A05(context, A05, 68386);
                    if (!c2ax.A01) {
                        str2 = "[no reminder] User has not seen thread";
                    } else if (c2ax.A00) {
                        str2 = "[no reminder] User has seen pin reminder";
                    } else if (((C1wi) c2ax.A03.A00.get()).A00() != C1wj.A04) {
                        str2 = "[no reminder] Device not onboarded";
                    } else {
                        C00i c00i = c2ax.A05.A00;
                        C1ud c1ud = (C1ud) c00i.get();
                        if (C1ud.A00(c1ud).AZr(c1ud.A02, 36316426694895635L)) {
                            C00i c00i2 = c2ax.A04.A00;
                            long now = ((C0dp) c00i2.get()).now();
                            9lI A00 = C2ax.A00(c2ax);
                            long Av1 = now - 9lI.A01(A00).Av1(C1wg.A03(1NK.A4q, 9lI.A00(A00)), 0L);
                            C1ud c1ud2 = (C1ud) c00i.get();
                            if (Av1 < C1ud.A00(c1ud2).Av9(c1ud2.A02, 36597901671534389L) * 60000) {
                                str2 = "[no reminder] within cooldown";
                            } else {
                                long A03 = C2ax.A00(c2ax).A03();
                                C1ud c1ud3 = (C1ud) c00i.get();
                                if (A03 >= C1ud.A00(c1ud3).Av9(c1ud3.A02, 36597901671468852L)) {
                                    str2 = "[no reminder] reached retry limit";
                                } else {
                                    int A02 = C2ax.A00(c2ax).A02();
                                    C1ud c1ud4 = (C1ud) c00i.get();
                                    String BDB = C1ud.A00(c1ud4).BDB(c1ud4.A02, 36879376649552795L);
                                    11T.A0A(BDB);
                                    Long l = null;
                                    try {
                                        str3 = (String) 0QD.A0J(0CU.A0M(BDB, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0), A02);
                                    } catch (NumberFormatException unused) {
                                    }
                                    if (str3 != null) {
                                        int parseInt = Integer.parseInt(str3);
                                        if (Integer.valueOf(parseInt) != null) {
                                            l = Long.valueOf(parseInt * 86400000);
                                            if (l != null) {
                                                long now2 = ((C0dp) c00i2.get()).now();
                                                9lI A002 = C2ax.A00(c2ax);
                                                if (now2 - 9lI.A01(A002).Av1(C1wg.A03(1NK.A4s, 9lI.A00(A002)), 0L) >= l.longValue()) {
                                                    0fH.A0j("EbLifecycleEventHandler", "should show pin reminder");
                                                    final C9c4 c9c4 = (C9c4) 1Lm.A05(context, A05, 68884);
                                                    if (c9c4.A02 != null) {
                                                        0fH.A0j("EbLifecycleEventHandler", "has vd id, show the bottom sheet");
                                                        A00(fragmentActivity, this);
                                                        return;
                                                    } else {
                                                        if (!this.A01) {
                                                            0fH.A0j("EbLifecycleEventHandler", "no vd id, avoid refreshing in same inbox");
                                                            return;
                                                        }
                                                        this.A01 = false;
                                                        0fH.A0j("EbLifecycleEventHandler", "has no vd id, refresh backup status before showing the bottom sheet");
                                                        c9c4.A01();
                                                        final int i = 0;
                                                        c9c4.A03.observe(fragmentActivity, new Observer(i, fragmentActivity, c2ax, c9c4, this) { // from class: X.3Ub
                                                            public final int A00;
                                                            public final Object A01;
                                                            public final Object A02;
                                                            public final Object A03;
                                                            public final Object A04;

                                                            {
                                                                this.A00 = i;
                                                                this.A03 = c9c4;
                                                                this.A04 = this;
                                                                this.A01 = fragmentActivity;
                                                                this.A02 = c2ax;
                                                            }

                                                            @Override // androidx.lifecycle.Observer
                                                            public /* bridge */ /* synthetic */ void onChanged(Object obj) {
                                                                String A0Z;
                                                                if (this.A00 == 0) {
                                                                    if (obj instanceof C8sp) {
                                                                        0fH.A0j("EbLifecycleEventHandler", "vd status loaded");
                                                                        if (((C9c4) this.A03).A02 != null) {
                                                                            C2aw.A00((FragmentActivity) this.A01, (C2aw) this.A04);
                                                                            return;
                                                                        }
                                                                        A0Z = "no hsm VD";
                                                                    } else {
                                                                        A0Z = AnonymousClass001.A0Z(obj, "vd status ", AnonymousClass001.A0k());
                                                                    }
                                                                    0fH.A0j("EbLifecycleEventHandler", A0Z);
                                                                    return;
                                                                }
                                                                ThreadSummaryDataModel threadSummaryDataModel = (ThreadSummaryDataModel) obj;
                                                                11T.A0F(threadSummaryDataModel, 0);
                                                                ThreadSummary threadSummary = threadSummaryDataModel.A00;
                                                                if (threadSummary != null) {
                                                                    if (2oI.A05(threadSummary)) {
                                                                        C3O8 c3o8 = (C3O8) this.A04;
                                                                        5SW r0 = (5SW) this.A03;
                                                                        c3o8.A00(r0);
                                                                        ((CQo) 1Br.A0B(c3o8.A00)).A0O(1Hb.A0I, r0, Long.valueOf(((ThreadKey) this.A02).A04), MRk.A00(7));
                                                                    } else if (2oI.A08(threadSummary)) {
                                                                        CQo cQo = (CQo) 1Br.A0B(((C3O8) this.A04).A00);
                                                                        Long valueOf = Long.valueOf(((ThreadKey) this.A02).A04);
                                                                        cQo.A0N(1Hb.A0I, (5SW) this.A03, valueOf);
                                                                    }
                                                                    ((LiveData) this.A01).removeObserver(this);
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                }
                                                str2 = "[no reminder] within success cooldown";
                                            }
                                        }
                                    }
                                    str2 = "[no reminder] finished pin reminder";
                                }
                            }
                        } else {
                            str2 = "[no reminder] MC is not enabled";
                        }
                    }
                    0fH.A0j("PinReminderProvider", str2);
                    return;
                }
            } else if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreate")) {
                0fH.A0j("EbLifecycleEventHandler", "onInboxCreate");
                1P9 r0 = new 1P9((1I7) this.A04.A00.get());
                r0.A05(new 3cG(this, 14), "com.facebook.orca.ACTION_SHOW_PASSKEY_CREATION_SUCCESS_SNACKBAR");
                1PA A022 = r0.A02();
                this.A00 = A022;
                A022.A00();
                return;
            }
        } else if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnDestroy")) {
            0fH.A0j("EbLifecycleEventHandler", "onInboxDestroy");
            1PA r02 = this.A00;
            if (r02 != null) {
                r02.A01();
                return;
            }
            return;
        }
        throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
    }
}
