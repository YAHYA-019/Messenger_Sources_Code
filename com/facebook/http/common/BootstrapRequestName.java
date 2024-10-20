package com.facebook.http.common;

import com.google.common.collect.ImmutableSet;

/* loaded from: BootstrapRequestName.class */
public @interface BootstrapRequestName {
    public static final ImmutableSet A00;

    static {
        String[] strArr = new String[42];
        System.arraycopy(new String[]{"validateRegistrationData", "syncXConfigs", "fetchSessionlessGKInfo", "fetchGKInfo", "registerPush", "unregisterPush", "logout", "authenticate", "bookmarkSync", "GetLoggedInUserQuery", "requestMessengerOnlyConfirmationCode", "confirmMessengerOnlyConfirmationCode", "loginBypassWithMessengerCredentials", "createMessengerOnlyAccount", "getMobileConfig", "FetchZeroTokenQuery", "FetchZeroDualTokenQuery", "SingleZeroRatingAPI", "DualZeroRatingAPI", "FetchZeroMessageQuotaQuery", "FetchZeroIPTest", "ZeroIPTestSubmitMutation", "FetchZeroBalanceConfigsQuery", "loyaltytopupapi", "LoyaltyTopupMutation", "messenger_invites", "messenger_only_migrate_account"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"FetchZeroTermsConditionsQuery", "FetchZeroOptinQuery", "ZeroSetOptinStateMutation", "fetchZeroHeaderRequest", "ZeroOptinTermsConditionIntentQuery", "ZeroCarrierPageIntentQuery", "FbBloksAppRootQuery-com.bloks.www.caa.login.cds_integration_point", "FbBloksAppRootQuery-com.bloks.www.caa.login.aymh.view_settings", "FbBloksActionRootQuery", "ContactpointConsentsQuery", "FbBloksAppRootQuery-com.bloks.www.bloks.zero.free_messenger_optout_nux", "FbBloksActionRootQuery-com.bloks.www.bloks.zero.free_messenger_optout_nux_async", "FbBloksAppRootQuery-com.bloks.www.zero.optin", "FbBloksAppRootQuery-com.bloks.www.zero.optin.reconsider", "FbBloksActionRootQuery-com.bloks.www.zero.optin.async"}, 0, strArr, 27, 15);
        A00 = ImmutableSet.A06("confirmContactpointPreconfirmation", "initiatePreconfirmation", "registerAccount", "accountRecoveryValidateCode", "AutoConfLoggedOutStoreVerifier", "resetPasswordPreconfirmation", strArr);
    }
}
