package X;

import com.facebook.messaging.composer.params.ComposerInitParamsSpec$ComposerLaunchSource;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.75u, reason: invalid class name */
/* loaded from: 75u.class */
public final class C75u implements 6xM {
    public HashSet A00;
    public boolean A01;
    public final ThreadKey A02;
    public final C6xN A03 = new C6xN();

    public C75u(C75t c75t) {
        ThreadKey threadKey = c75t.A00;
        threadKey.getClass();
        this.A02 = threadKey;
        this.A00 = c75t.A01;
    }

    private void A00() {
        if (this.A01) {
            return;
        }
        C6xN c6xN = this.A03;
        11T.A0F(c6xN, 1);
        c6xN.A00 = 1Bn.A0A(85056);
        this.A01 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A00;
        if (hashSet == null) {
            hashSet = new HashSet(Arrays.asList(7Co.class, 7Cp.class, 7Cq.class, 7Cr.class, 7Cs.class, 7Ct.class, 7Cu.class, 7Cv.class, 7Cw.class, 7Cx.class, 7Cy.class, 7Cz.class, C7D0.class, C7D1.class, 7D2.class));
            this.A00 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "GalleryLoggerPlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        UserFlowLogger A00;
        long j;
        String str;
        boolean z;
        PointEditor markPointWithEditor;
        String str2;
        PointEditor addPointData;
        1UG A002;
        Boolean valueOf;
        String str3;
        F4x A003;
        int i;
        int i2;
        String str4;
        String str5;
        String str6;
        if (r305 instanceof 7Cp) {
            A00();
            ThreadKey threadKey = this.A02;
            Hrv hrv = (Hrv) this.A03.A00;
            11T.A0F(hrv, 1);
            String obj = C04I.A00().toString();
            6xB.A00 = obj;
            if (obj != null) {
                F4x A004 = 6xB.A00();
                A004.A00 = F4x.A00(A004).generateNewFlowId(1062147522);
                F4x.A00(A004).flowStart(A004.A00, "MessengerMediaPickerFunnelLogger", false);
                F4x.A00(A004).flowAnnotate(A004.A00, "thread_key", threadKey.toString());
                F4x.A00(A004).flowAnnotate(A004.A00, "creation_session_id", obj);
                hrv.A01(ComposerInitParamsSpec$ComposerLaunchSource.A05, threadKey, obj, false);
                return;
            }
            return;
        }
        if (r305 instanceof 7Cz) {
            A00();
            F4x A005 = 6xB.A00();
            F4x.A00(A005).flowEndSuccess(A005.A00, "media_picker_close");
            A005.A00 = 0L;
            return;
        }
        if (r305 instanceof 7D2) {
            A00();
            7D2 r0 = (7D2) r305;
            11T.A0F(r0, 0);
            A003 = 6xB.A00();
            i = r0.A00;
            i2 = r0.A01;
            str4 = r0.A02.A09;
            11T.A0A(str4);
            str5 = "media_select";
        } else {
            if (!(r305 instanceof 7Ct)) {
                if (r305 instanceof 7Cv) {
                    A00();
                    7Cv r02 = (7Cv) r305;
                    ThreadKey threadKey2 = this.A02;
                    Hrv hrv2 = (Hrv) this.A03.A00;
                    11T.A0G(r02, 0, hrv2);
                    F4x A006 = 6xB.A00();
                    String str7 = r02.A00.A09;
                    11T.A0A(str7);
                    F4x.A00(A006).markPointWithEditor(A006.A00, "edit_click").addPointData("media_type", 11T.A0P("image/", 1, str7) ? "photo" : 11T.A0P("video/", 1, str7) ? "video" : "other").pointEditingCompleted();
                    String str8 = 6xB.A00;
                    if (str8 != null) {
                        hrv2.A00(ComposerInitParamsSpec$ComposerLaunchSource.A05, threadKey2, str8, false);
                        return;
                    }
                    return;
                }
                if (r305 instanceof 7Cw) {
                    A00();
                    ThreadKey threadKey3 = this.A02;
                    Hrv hrv3 = (Hrv) this.A03.A00;
                    11T.A0F(hrv3, 2);
                    String str9 = 6xB.A00;
                    if (str9 == null) {
                        return;
                    }
                    ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource = ComposerInitParamsSpec$ComposerLaunchSource.A05;
                    if (!hrv3.A02) {
                        return;
                    }
                    A002 = 1BK.A08(1Br.A02(hrv3.A01), 1BJ.A00(1793));
                    if (!A002.isSampled()) {
                        return;
                    }
                    EnumC03583yg A007 = AbstractC03573yf.A00(threadKey3);
                    A002.A7R("creation_session_id", str9);
                    4YU.A1I(A002, "major_entry_point", C7l7.A00(composerInitParamsSpec$ComposerLaunchSource));
                    boolean z2 = true;
                    A002.A0B("minor_entry_point");
                    A002.A5c(A007, "thread_type");
                    if (!threadKey3.A0z()) {
                        z2 = false;
                    }
                    valueOf = Boolean.valueOf(z2);
                    str3 = "is_e2ee";
                } else {
                    if (r305 instanceof 7Co) {
                        A00();
                        ThreadKey threadKey4 = this.A02;
                        Hrv hrv4 = (Hrv) this.A03.A00;
                        11T.A0F(hrv4, 2);
                        String str10 = 6xB.A00;
                        if (str10 != null) {
                            ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource2 = ComposerInitParamsSpec$ComposerLaunchSource.A05;
                            if (hrv4.A02) {
                                A002 = 1UD.A00((04J) hrv4.A01.A00.get(), 1ZG.A01, "msg_media_picker_did_select");
                                if (A002.isSampled()) {
                                    String valueOf2 = String.valueOf(threadKey4.A0r());
                                    EnumC03583yg A008 = AbstractC03573yf.A00(threadKey4);
                                    A002.A7R("creation_session_id", str10);
                                    A002.A5q("major_entry_point", Integer.valueOf(C7l7.A00(composerInitParamsSpec$ComposerLaunchSource2)));
                                    boolean z3 = true;
                                    A002.A5q("minor_entry_point", 1);
                                    A002.A5c(A008, "thread_type");
                                    if (!threadKey4.A0z()) {
                                        z3 = false;
                                    }
                                    A002.A5H("is_e2ee", Boolean.valueOf(z3));
                                    A002.A7R("thread_id", valueOf2);
                                    A002.BZL();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!(r305 instanceof 7Cr)) {
                        if (r305 instanceof 7Cq) {
                            A00();
                            7Cq r03 = (7Cq) r305;
                            11T.A0F(r03, 0);
                            F4x A009 = 6xB.A00();
                            addPointData = F4x.A00(A009).markPointWithEditor(A009.A00, "send_click").addPointData("num_selected", r03.A00);
                        } else if (r305 instanceof 7Cx) {
                            A00();
                            7Cx r04 = (7Cx) r305;
                            11T.A0F(r04, 0);
                            F4x A0010 = 6xB.A00();
                            addPointData = F4x.A00(A0010).markPointWithEditor(A0010.A00, "hd_click").addPointData("num_selected", r04.A00).addPointData("is_enabled", true);
                        } else {
                            if (r305 instanceof 7Cs) {
                                A00();
                                7Cs r05 = (7Cs) r305;
                                z = false;
                                11T.A0F(r05, 0);
                                F4x A0011 = 6xB.A00();
                                markPointWithEditor = F4x.A00(A0011).markPointWithEditor(A0011.A00, "hd_click").addPointData("num_selected", r05.A00);
                                str2 = "is_enabled";
                            } else {
                                if (!(r305 instanceof C7D1)) {
                                    if (r305 instanceof 7Cu) {
                                        A00();
                                        F4x A0012 = 6xB.A00();
                                        A00 = F4x.A00(A0012);
                                        j = A0012.A00;
                                        str = "media_picker_expanded";
                                    } else if (r305 instanceof C7D0) {
                                        A00();
                                        F4x A0013 = 6xB.A00();
                                        A00 = F4x.A00(A0013);
                                        j = A0013.A00;
                                        str = "media_picker_collapsed";
                                    } else {
                                        if (!(r305 instanceof 7Cy)) {
                                            return;
                                        }
                                        A00();
                                        7Cy r06 = (7Cy) r305;
                                        11T.A0F(r06, 0);
                                        int intValue = r06.A00.intValue();
                                        if (intValue != 0) {
                                            F4x A0014 = 6xB.A00();
                                            long j2 = A0014.A00;
                                            if (intValue != 1) {
                                                if (j2 == 0) {
                                                    return;
                                                }
                                                A00 = F4x.A00(A0014);
                                                j = A0014.A00;
                                                str = "media_picker_loading_failure";
                                            } else {
                                                if (j2 == 0) {
                                                    return;
                                                }
                                                A00 = F4x.A00(A0014);
                                                j = A0014.A00;
                                                str = "media_picker_loading_success";
                                            }
                                        } else {
                                            F4x A0015 = 6xB.A00();
                                            if (A0015.A00 == 0) {
                                                return;
                                            }
                                            A00 = F4x.A00(A0015);
                                            j = A0015.A00;
                                            str = "media_picker_loading_started";
                                        }
                                    }
                                    A00.flowMarkPoint(j, str);
                                    return;
                                }
                                A00();
                                C7D1 c7d1 = (C7D1) r305;
                                11T.A0F(c7d1, 0);
                                F4x A0016 = 6xB.A00();
                                z = c7d1.A00;
                                markPointWithEditor = F4x.A00(A0016).markPointWithEditor(A0016.A00, "hd_nux_dismissed");
                                str2 = "primary_button_clicked";
                            }
                            addPointData = markPointWithEditor.addPointData(str2, z);
                        }
                        addPointData.pointEditingCompleted();
                    }
                    A00();
                    7Cr r07 = (7Cr) r305;
                    ThreadKey threadKey5 = this.A02;
                    Hrv hrv5 = (Hrv) this.A03.A00;
                    11T.A0F(r07, 0);
                    11T.A0F(hrv5, 2);
                    String str11 = 6xB.A00;
                    if (str11 == null) {
                        return;
                    }
                    ComposerInitParamsSpec$ComposerLaunchSource composerInitParamsSpec$ComposerLaunchSource3 = ComposerInitParamsSpec$ComposerLaunchSource.A05;
                    boolean z4 = r07.A00;
                    if (!hrv5.A02) {
                        return;
                    }
                    A002 = 1UD.A00((04J) hrv5.A01.A00.get(), 1ZG.A01, "msg_media_picker_did_send");
                    if (!A002.isSampled()) {
                        return;
                    }
                    EnumC03583yg A0017 = AbstractC03573yf.A00(threadKey5);
                    A002.A7R("creation_session_id", str11);
                    A002.A5q("major_entry_point", Integer.valueOf(C7l7.A00(composerInitParamsSpec$ComposerLaunchSource3)));
                    boolean z5 = true;
                    A002.A5q("minor_entry_point", 1);
                    A002.A5c(A0017, "thread_type");
                    if (!threadKey5.A0z()) {
                        z5 = false;
                    }
                    A002.A5H("is_e2ee", Boolean.valueOf(z5));
                    valueOf = Boolean.valueOf(z4);
                    str3 = "is_hd";
                }
                A002.A5H(str3, valueOf);
                A002.BZL();
                return;
            }
            A00();
            7Ct r08 = (7Ct) r305;
            11T.A0F(r08, 0);
            A003 = 6xB.A00();
            i = r08.A00;
            i2 = r08.A01;
            str4 = r08.A02.A09;
            11T.A0A(str4);
            str5 = "media_deselect";
        }
        PointEditor addPointData2 = F4x.A00(A003).markPointWithEditor(A003.A00, str5).addPointData("media_index", i).addPointData("num_selected", i2);
        11T.A0F("image/", 1);
        if (str4.startsWith("image/")) {
            str6 = "photo";
        } else {
            11T.A0F("video/", 1);
            str6 = str4.startsWith("video/") ? "video" : "other";
        }
        addPointData = addPointData2.addPointData("media_type", str6);
        addPointData.pointEditingCompleted();
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00();
    }
}
