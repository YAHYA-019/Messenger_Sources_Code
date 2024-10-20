package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.proxygen.TraceFieldType;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: LV0.class */
public final class LV0 implements ML4 {
    public final Koc A00;

    public LV0(Koc koc) {
        this.A00 = koc;
    }

    public static void A00(BaseBundle baseBundle, 1Rf r302, L2q l2q, String str, String str2) {
        l2q.A02(str, str2);
        r302.A06(Boolean.valueOf(baseBundle.getBoolean("full_upload")), "full_upload");
    }

    public static void A01(BaseBundle baseBundle, 1Rf r302, Number number, String str) {
        r302.A07(number, str);
        r302.A07(Long.valueOf(baseBundle.getLong("time_spent")), "time_spent");
        r302.A07(Integer.valueOf(baseBundle.getInt("num_of_retries")), "num_of_retries");
    }

    public static void A02(BaseBundle baseBundle, 1Rf r302, String str) {
        r302.A07(Integer.valueOf(baseBundle.getInt(str)), str);
    }

    private void A03(Bundle bundle) {
        L2q A00 = this.A00.A00(AbstractC00603o4.A00(51));
        1Rf r0 = A00.A00;
        if (r0.A0D()) {
            A00.A02(TraceFieldType.FailureReason, bundle.getString(TraceFieldType.FailureReason));
            A00(bundle, r0, A00, "failure_message", bundle.getString("failure_message"));
            A01(bundle, r0, AbI.A10(bundle, "last_upload_success_time"), "last_upload_success_time");
            A00.A02("ccu_session_id", bundle.getString("ccu_session_id"));
            L2q.A00(bundle, A00, Property.SYMBOL_Z_ORDER_SOURCE);
        }
    }

    public static void A04(L2q l2q, String str, String str2, String str3) {
        l2q.A02("action", str);
        if (str2 != null) {
            l2q.A02(str3, str2);
        }
    }

    public void A05(String str, String str2, String str3) {
        L2q A00 = this.A00.A00("contact_importer_enable_ccu_event");
        if (A00.A00.A0D()) {
            A00.A02("legal_screen_entry_source", str);
            A00.A02("current_client_ccu_status", str2);
            A00.A02("current_server_ccu_status", str3);
            A00.A01();
        }
    }

    public void A06(String str, String str2, String str3) {
        L2q A00 = this.A00.A00(AbstractC00603o4.A00(ActionId.ASYNC_FAIL));
        if (A00.A00.A0D()) {
            A00.A02("entry_point", "background_job_new_protocol_remote_setting");
            A00.A02("action", str);
            if (str2 != null) {
                A00.A02(TraceFieldType.FailureReason, str2);
            }
            if (str3 != null) {
                A00.A02("fdid", str3);
            }
            A00.A01();
        }
    }

    @Override // X.ML4
    public void Bkw(Bundle bundle) {
        A03(bundle);
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        L2q A00 = this.A00.A00("ccu_upload_contacts_event");
        if (A00.A00.A0D()) {
            A04(A00, "batch_upload_failure", string, "family_device_id");
            if (string2 != null) {
                A00.A02("ccu_session_id", string2);
            }
            A00.A01();
        }
    }

    @Override // X.ML4
    public void Bkx(Bundle bundle) {
        Koc koc = this.A00;
        L2q A00 = koc.A00(AbstractC00603o4.A00(15));
        1Rf r0 = A00.A00;
        if (r0.A0D()) {
            A00(bundle, r0, A00, "upload_step", "batch_upload_succeed");
            A02(bundle, r0, "batch_index");
            A02(bundle, r0, "batch_size");
            A02(bundle, r0, "contacts_upload_count");
            A02(bundle, r0, "add_count");
            A02(bundle, r0, "remove_count");
            A01(bundle, r0, DKD.A0l(bundle, "update_count"), "update_count");
            L2q.A00(bundle, A00, "ccu_session_id");
        }
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        L2q A002 = koc.A00("ccu_upload_contacts_event");
        if (A002.A00.A0D()) {
            A04(A002, "batch_upload_succeed", string, "family_device_id");
            if (string2 != null) {
                A002.A02("ccu_session_id", string2);
            }
            A002.A01();
        }
    }

    @Override // X.ML4
    public void BpS(Bundle bundle) {
        A03(bundle);
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        L2q A00 = this.A00.A00("ccu_upload_contacts_event");
        if (A00.A00.A0D()) {
            A04(A00, "close_session_failure", string, "family_device_id");
            if (string2 != null) {
                A00.A02("ccu_session_id", string2);
            }
            A00.A01();
        }
    }

    @Override // X.ML4
    public void BpT(Bundle bundle) {
        Koc koc = this.A00;
        L2q A00 = koc.A00(AbstractC00603o4.A00(ActionId.MESSENGER_DELTA_REQUEST));
        1Rf r0 = A00.A00;
        if (r0.A0D()) {
            r0.A06(Boolean.valueOf(bundle.getBoolean("full_upload")), "full_upload");
            A01(bundle, r0, AbI.A10(bundle, "last_upload_success_time"), "last_upload_success_time");
            L2q.A00(bundle, A00, "ccu_session_id");
        }
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        L2q A002 = koc.A00("ccu_upload_contacts_event");
        if (A002.A00.A0D()) {
            if (string2 != null) {
                A002.A02("ccu_session_id", string2);
            }
            A04(A002, "close_session_success", string, "family_device_id");
            A002.A01();
        }
    }

    @Override // X.ML4
    public void Brx(Bundle bundle) {
        A03(bundle);
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString(TraceFieldType.FailureReason);
        String string3 = bundle.getString("ccu_session_id");
        L2q A00 = this.A00.A00("ccu_upload_contacts_event");
        if (A00.A00.A0D()) {
            A04(A00, "create_session_failure", string2, TraceFieldType.FailureReason);
            if (string != null) {
                A00.A02("family_device_id", string);
            }
            if (string3 != null) {
                A00.A02("ccu_session_id", string3);
            }
            A00.A01();
        }
    }

    @Override // X.ML4
    public void Bry(Bundle bundle) {
        Koc koc = this.A00;
        L2q A00 = koc.A00(AbstractC00603o4.A00(ActionId.APP_FIRST_VIEW_CONTROLLER));
        1Rf r0 = A00.A00;
        if (r0.A0D()) {
            r0.A06(Boolean.valueOf(bundle.getBoolean("in_sync")), "in_sync");
            A00.A02("root_hash", bundle.getString("root_hash"));
            A01(bundle, r0, AbI.A10(bundle, "last_upload_success_time"), "last_upload_success_time");
            L2q.A00(bundle, A00, "ccu_session_id");
        }
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        L2q A002 = koc.A00("ccu_upload_contacts_event");
        if (A002.A00.A0D()) {
            if (string2 != null) {
                A002.A02("ccu_session_id", string2);
            }
            A04(A002, "create_session_success", string, "family_device_id");
            A002.A01();
        }
    }

    @Override // X.ML4
    public void CDL(Bundle bundle) {
        Koc koc = this.A00;
        L2q A00 = koc.A00(AbstractC00603o4.A00(15));
        1Rf r0 = A00.A00;
        if (r0.A0D()) {
            A00(bundle, r0, A00, "upload_step", "batch_upload");
            A02(bundle, r0, "batch_index");
            A02(bundle, r0, "batch_size");
            A02(bundle, r0, "contacts_upload_count");
            A02(bundle, r0, "add_count");
            A02(bundle, r0, "remove_count");
            A01(bundle, r0, DKD.A0l(bundle, "update_count"), "update_count");
            L2q.A00(bundle, A00, "ccu_session_id");
        }
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString("ccu_session_id");
        L2q A002 = koc.A00("ccu_upload_contacts_event");
        if (A002.A00.A0D()) {
            A04(A002, "batch_upload_start", string, "family_device_id");
            if (string2 != null) {
                A002.A02("ccu_session_id", string2);
            }
            A002.A01();
        }
    }

    @Override // X.ML4
    public void CDM(Bundle bundle) {
        Koc koc = this.A00;
        L2q A00 = koc.A00(AbstractC00603o4.A00(15));
        1Rf r0 = A00.A00;
        if (r0.A0D()) {
            A00(bundle, r0, A00, "upload_step", "close_session");
            A02(bundle, r0, "total_batch_count");
            A02(bundle, r0, "contacts_upload_count");
            A02(bundle, r0, "add_count");
            A02(bundle, r0, "remove_count");
            A02(bundle, r0, "update_count");
            A02(bundle, r0, "phonebook_size");
            A01(bundle, r0, AbI.A10(bundle, "max_contacts_to_upload"), "max_contacts_to_upload");
            String string = bundle.getString("ccu_session_id");
            if (string != null) {
                A00.A02("ccu_session_id", string);
            }
            A00.A01();
        }
        String string2 = bundle.getString("family_device_id");
        String string3 = bundle.getString("ccu_session_id");
        L2q A002 = koc.A00("ccu_upload_contacts_event");
        if (A002.A00.A0D()) {
            A04(A002, "close_session_start", string2, "family_device_id");
            if (string3 != null) {
                A002.A02("ccu_session_id", string3);
            }
            A002.A01();
        }
    }

    @Override // X.ML4
    public void CDN(Bundle bundle) {
        String string = bundle.getString("family_device_id");
        L2q A00 = this.A00.A00("ccu_upload_contacts_event");
        if (A00.A00.A0D()) {
            A04(A00, "pre_ccu_check", string, "family_device_id");
            A00.A01();
        }
    }

    @Override // X.ML4
    public void CN1(Bundle bundle) {
        Koc koc = this.A00;
        L2q A00 = koc.A00(AbstractC00603o4.A00(15));
        1Rf r0 = A00.A00;
        if (r0.A0D()) {
            A00(bundle, r0, A00, "upload_step", "create_session");
            A00.A02(Property.SYMBOL_Z_ORDER_SOURCE, bundle.getString(Property.SYMBOL_Z_ORDER_SOURCE));
            A02(bundle, r0, "batch_size");
            A02(bundle, r0, "num_of_retries");
            A02(bundle, r0, "contacts_upload_count");
            r0.A07(AbI.A10(bundle, "time_spent"), "time_spent");
            A00.A01();
        }
        String string = bundle.getString("family_device_id");
        L2q A002 = koc.A00("ccu_upload_contacts_event");
        if (A002.A00.A0D()) {
            A04(A002, "create_session_start", string, "family_device_id");
            A002.A01();
        }
    }

    @Override // X.ML4
    public void CSo(Bundle bundle) {
        Koc koc = this.A00;
        L2q A00 = koc.A00(AbstractC00603o4.A00(51));
        if (A00.A00.A0D()) {
            L2q.A00(bundle, A00, TraceFieldType.FailureReason);
        }
        String string = bundle.getString("family_device_id");
        String string2 = bundle.getString(TraceFieldType.FailureReason);
        L2q A002 = koc.A00("ccu_upload_contacts_event");
        if (A002.A00.A0D()) {
            A04(A002, "pre_ccu_check_failed", string, "family_device_id");
            if (string2 != null) {
                A002.A02(TraceFieldType.FailureReason, string2);
            }
            A002.A01();
        }
    }
}
