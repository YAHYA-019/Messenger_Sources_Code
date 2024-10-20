package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.2xj, reason: invalid class name */
/* loaded from: 2xj.class */
public final class C2xj extends C00q implements C00m {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2xj(1Ky r302, int i) {
        super(0);
        this.A00 = i;
        this.A01 = r302;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        int i = this.A00;
        1G2 A00 = ((1Ky) this.A01).A00();
        switch (i) {
            case 0:
                str = "freemium_fup_interstitial_reset_time";
                break;
            case 1:
                str = "freemium_zero_balance_detection_reset_time";
                break;
            case 2:
                str = "carrier_bottom_banner_data_key";
                break;
            case 3:
                str = "last_updated_dogfooding_setting";
                break;
            case 4:
                str = "lightswitch_optin/";
                break;
            case 5:
                str = TraceFieldType.NetworkType;
                break;
            case 6:
                str = "next_zbd_upsell_scheduled_reminder_time";
                break;
            case 7:
                str = "periodic_zbd_upsell_reminder_suppressed";
                break;
            case 8:
                str = "semi_free_optout_interstitial_admin_text_shown";
                break;
            case 9:
                str = "semi_free_upgrade_without_interstitial_admin_text_shown";
                break;
            case 10:
                str = "semi_free_upgrade_without_interstitial_count";
                break;
            case 11:
                str = "sp_interstitial_suppressed_carriers";
                break;
            case 12:
                str = "status_update_content_history";
                break;
            case 13:
                str = "upgrade_message_id";
                break;
            case 14:
                str = "upsell_mc_nux_tooltip_impression";
                break;
            case 15:
                str = "zero_balance_configs";
                break;
            case 16:
                str = "zero_balance_free_to_paid_interstitial_snooze_timestamp";
                break;
            case 17:
                str = "zero_balance_host_regexes_refresh_interval";
                break;
            case 18:
                str = "zero_balance_prefetch_recommendations_cool_down";
                break;
            case 19:
                str = "zero_balance_prefetch_recommendations_last_call";
                break;
            case 20:
                str = "zero_balance_url_configs";
                break;
            case 21:
                str = "cms_carrier_id";
                break;
            case 22:
                str = "cms_client_hash";
                break;
            case 23:
                str = "cms_data";
                break;
            case 24:
                str = "cms_locale";
                break;
            case 25:
                str = "zero_fup_interstitial_interstitial_timestamp";
                break;
            case 26:
                str = "zero_messenger_balance_detection_upsell_reset_time";
                break;
            case 27:
                str = "zero_messenger_dialog_snooze_end_time";
                break;
            case 28:
                str = "zero_messenger_dialog_upgrade_count";
                break;
            case 29:
                str = "zero_messenger_fup_interstitial_interstitial_timestamp";
                break;
            case 30:
                str = "zero_messenger_user_balance_state";
                break;
            case 31:
                str = "zero_messenger_balance_detection_expire_time";
                break;
            case 32:
                str = "optin_api_response_time";
                break;
            case 33:
                str = "optin_api_response_type_name";
                break;
            case 34:
                str = "optin_api_cache_carrier_id";
                break;
            case 35:
                str = "optin_interstitial_shown_time";
                break;
            default:
                str = "zero_unknown_state";
                break;
        }
        1G3 A0D = A00.A0D(str);
        11T.A0A(A0D);
        return A0D;
    }
}
