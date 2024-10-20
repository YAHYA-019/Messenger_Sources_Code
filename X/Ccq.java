package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.messengerkids.plugins.core.mesettings.MessengerKidsProfileSetting;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.profilepic.PicSquare;
import com.facebook.user.profilepic.PicSquareUrlWithSize;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccq.class */
public final class Ccq implements DIL {
    public MessengerKidsProfileSetting A00;
    public Object A01;
    public final Context A02;
    public final 06Z A03;
    public final FbUserSession A04;
    public final 1pI A05;
    public final 1YC A06 = 1YC.A03;
    public final DFp A07;

    public Ccq(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, DFp dFp) {
        this.A02 = context;
        this.A07 = dFp;
        this.A03 = r303;
        this.A05 = r305;
        this.A04 = fbUserSession;
    }

    private boolean A00() {
        boolean A00;
        Object obj;
        if (this.A01 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A06;
            r0.A0B("com.facebook.messaging.messengerkids.plugins.core.mesettings.MessengerKidsProfileSetting", "messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.messengerkids.plugins.core.MessengerkidsCoreKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    int i = C1Y6.A00;
                    if (BZH.A00 == i) {
                        Boolean bool = BZH.A01;
                        if (bool != null) {
                            A00 = bool.booleanValue();
                            if (A00 || !AbJ.A0N().A02(35)) {
                                obj = C1Y6.A03;
                            } else {
                                this.A00 = new MessengerKidsProfileSetting(this.A02, this.A04);
                                obj = C1Y6.A02;
                            }
                            this.A01 = obj;
                            r0.A07("messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    A00 = BZH.A00(r0, atomicInteger, i);
                    if (A00) {
                    }
                    obj = C1Y6.A03;
                    this.A01 = obj;
                    r0.A07("messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A01 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement, 1BL.A1U(this.A01));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement, 1BL.A1U(this.A01));
                throw th;
            }
        }
        return 1BK.A1U(this.A01);
    }

    public C8e AKx(MigColorScheme migColorScheme, String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A06;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", A00);
        r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItem", A00);
        return null;
    }

    public ImmutableList AKy(MigColorScheme migColorScheme, String str) {
        boolean z;
        ImmutableList of;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A06;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", andIncrement);
        ImmutableList immutableList = null;
        Exception e = null;
        try {
            if (str.equals("MessengerKids") && A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.messengerkids.plugins.core.mesettings.MessengerKidsProfileSetting", "messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.messengerkids.plugins.core.MessengerkidsCoreKillSwitch", "createSettingsRowItems");
                try {
                    try {
                        MessengerKidsProfileSetting messengerKidsProfileSetting = this.A00;
                        DFp dFp = this.A07;
                        Context context = this.A02;
                        11T.A0H(dFp, context);
                        11T.A0F(migColorScheme, 2);
                        boolean A03 = 0Kh.A03(context.getPackageManager(), "com.facebook.katana");
                        FbUserSession fbUserSession = messengerKidsProfileSetting.A02;
                        Bvx bvx = (Bvx) 1Lm.A05(context, fbUserSession, 83730);
                        List list = bvx.A03;
                        int i = 0;
                        if (list == null || list.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                            Bf4 bf4 = (Bf4) 1Br.A0B(messengerKidsProfileSetting.A05);
                            String str2 = A03 ? "mk_fb_installed" : "mk_fb_not_installed";
                            1UG A08 = 1BK.A08(1Br.A02(bf4.A00), "mk_messenger_me_tab");
                            if (A08.isSampled()) {
                                AbF.A1M(A08, str2);
                                A08.BZL();
                            }
                        }
                        if (A03 && z) {
                            ImmutableList.Builder builder = ImmutableList.builder();
                            List<C9W> list2 = bvx.A03;
                            if (list2 != null) {
                                list2.size();
                                for (C9W c9w : list2) {
                                    int i2 = c9w.A00;
                                    i += i2;
                                    C58t c58t = new C58t(new PicSquare(ImmutableList.of((Object) new PicSquareUrlWithSize(AbK.A00(context), c9w.A02()))));
                                    AnonymousClass555 A00 = i2 > 0 ? BXX.A00(migColorScheme, (CharSequence) null, i2) : null;
                                    CQ0 A002 = CQ0.A00();
                                    A002.A04(c9w.A01());
                                    A002.A02 = c58t;
                                    A002.A04 = A00;
                                    A002.A01 = new Cvd(0, 1BK.A17(list2), dFp, c9w, messengerKidsProfileSetting, context);
                                    builder.m11011add((Object) new C8e(A002));
                                }
                                bvx.A00 = i;
                            }
                            of = builder.build();
                        } else {
                            of = ImmutableList.of();
                        }
                        11T.A0A(of);
                        Bvx bvx2 = (Bvx) 1Lm.A05(context, fbUserSession, 83730);
                        if (bvx2.A04 || of.size() <= 3) {
                            immutableList = of;
                        } else {
                            ImmutableList.Builder builder2 = ImmutableList.builder();
                            List list3 = bvx2.A03;
                            int i3 = bvx2.A00;
                            if (list3 != null) {
                                int i4 = 0;
                                do {
                                    builder2.m11011add(of.get(i4));
                                    i3 -= ((C9W) list3.get(i4)).A00;
                                    i4++;
                                } while (i4 < 2);
                            }
                            CQ0 A003 = CQ0.A00();
                            CQ0.A03(context, A003, 2131960085);
                            A003.A01 = new CvN(14, dFp, messengerKidsProfileSetting, context);
                            A003.A04 = i3 == 0 ? null : BXX.A00(migColorScheme, (CharSequence) null, i3);
                            builder2.m11011add((Object) new C8e(A003));
                            immutableList = 1Fj.A01(builder2);
                        }
                        r0.A09("messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", andIncrement);
            return immutableList;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "createSettingsRowItems", andIncrement);
            throw th2;
        }
    }

    public void dispose() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A06;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
        try {
            if (A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.messengerkids.plugins.core.mesettings.MessengerKidsProfileSetting", "messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.messengerkids.plugins.core.MessengerkidsCoreKillSwitch", "dispose");
                    try {
                        MessengerKidsProfileSetting messengerKidsProfileSetting = this.A00;
                        FbUserSession fbUserSession = messengerKidsProfileSetting.A02;
                        Context context = messengerKidsProfileSetting.A01;
                        Bvx bvx = (Bvx) 1Lm.A05(context, fbUserSession, 83730);
                        bvx.A04 = false;
                        bvx.A00 = 0;
                        1PA r02 = messengerKidsProfileSetting.A00;
                        if (r02 != null) {
                            r02.A01();
                        }
                        messengerKidsProfileSetting.A00 = null;
                        ((2UV) 1Lm.A05(context, fbUserSession, 84216)).CmR((2TV) null);
                        r0.A09("messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "dispose", andIncrement);
            throw th2;
        }
    }

    public void init() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A06;
        r0.A08("com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
        Exception e = null;
        try {
            if (A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.messengerkids.plugins.core.mesettings.MessengerKidsProfileSetting", "messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "com.facebook.messaging.settings.plugins.interfaces.mesettings.settingsitem.MeSettingsItemInterfaceSpec", andIncrement2, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "com.facebook.messaging.messengerkids.plugins.core.MessengerkidsCoreKillSwitch", "init");
                try {
                    try {
                        MessengerKidsProfileSetting messengerKidsProfileSetting = this.A00;
                        DFp dFp = this.A07;
                        Context context = this.A02;
                        11T.A0H(dFp, context);
                        int A00 = AbK.A00(context);
                        if (A00 > 0) {
                            if (messengerKidsProfileSetting.A00 == null) {
                                1P9 A002 = 1P9.A00(messengerKidsProfileSetting.A04.A00);
                                D0U.A01(A002, messengerKidsProfileSetting, "com.facebook.orca.ACTION_KIDS_ENTRY_CHANGED", 19);
                                1PA A02 = A002.A02();
                                messengerKidsProfileSetting.A00 = A02;
                                A02.A00();
                                C1620Any c1620Any = (C1620Any) 1Lm.A05(context, messengerKidsProfileSetting.A02, 84216);
                                ((2UV) c1620Any).A01 = new C1619Anx(0, dFp, messengerKidsProfileSetting, c1620Any);
                            }
                            ((2UV) 1Lm.A05(context, messengerKidsProfileSetting.A02, 84216)).D1t(new Bpx(0S2.A00, A00, A00));
                        }
                        r0.A09("messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.messengerkids.core.mesettings.MessengerKidsProfileSetting", "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.settings.mesettings.settingsitem.MeSettingsItemInterfaceSpec", "init", andIncrement);
            throw th2;
        }
    }
}
