package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.6qw, reason: invalid class name */
/* loaded from: 6qw.class */
public final class C6qw extends 2Lg {
    public /* bridge */ /* synthetic */ Object A02() {
        7Sv r0 = new 7Sv();
        r0.A00 = 1tE.A00.get();
        r0.A05 = 1tE.A05.get();
        r0.A04 = 1tE.A04.get();
        r0.A01 = 1tE.A01.get();
        r0.A02 = 1tE.A02.get();
        r0.A03 = 1tE.A03.get();
        r0.A06 = 1tE.A09.get();
        r0.A0A = 1tE.A0D.get();
        r0.A09 = 1tE.A0C.get();
        r0.A07 = 1tE.A0A.get();
        r0.A08 = 1tE.A0B.get();
        return r0;
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        7Sv r0 = (7Sv) obj;
        7Sv r02 = (7Sv) obj2;
        if (r0 != null && r02 != null) {
            r302.AxQ().A03("litho_component_applied_state_update_counter", r02.A00 - r0.A00);
            r302.AxQ().A03("litho_component_triggered_sync_state_update_counter", r02.A05 - r0.A05);
            r302.AxQ().A03("litho_component_triggered_async_state_update_counter", r02.A04 - r0.A04);
            r302.AxQ().A03("litho_calculate_layout_counter", r02.A01 - r0.A01);
            r302.AxQ().A03("litho_calculate_layout_on_ui_counter", r02.A02 - r0.A02);
            r302.AxQ().A03("litho_mount_counter", r02.A03 - r0.A03);
            r302.AxQ().A03("litho_section_applied_state_update_counter", r02.A06 - r0.A06);
            r302.AxQ().A03("litho_section_triggered_sync_state_update_counter", r02.A0A - r0.A0A);
            r302.AxQ().A03("litho_section_triggered_async_state_update_counter", r02.A09 - r0.A09);
            r302.AxQ().A03("litho_section_calculate_new_changeset_counter", r02.A07 - r0.A07);
            r302.AxQ().A03("litho_section_calculate_new_changeset_on_ui_counter", r02.A08 - r0.A08);
        }
        return 1hM.A01;
    }

    public String B5Q() {
        return "litho_stats";
    }

    public int B5R() {
        return 15;
    }

    public Class BBP() {
        return 7Sv.class;
    }

    public boolean BS6(2Lc r302) {
        return true;
    }
}
