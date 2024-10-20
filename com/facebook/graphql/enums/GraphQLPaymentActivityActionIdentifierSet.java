package com.facebook.graphql.enums;

import X.DKF;
import com.facebook.acra.constants.ActionId;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLPaymentActivityActionIdentifierSet.class */
public final class GraphQLPaymentActivityActionIdentifierSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[173];
        System.arraycopy(new String[]{"ACCIDENTAL_ORDER", "ADD_REVIEW", "ANOTHER_QUESTION", "ATTACH_NEW_RECEIPT", "BUYER_BUY_AGAIN", "BUYER_DPO_CONTACT_SUPPORT", "BUYER_MP_SEE_RETURN_DETAILS", "BUYER_MP_SEE_SELLER_MESSAGE", "BUYER_ORDER_BYO_RETURN", "BUYER_ORDER_CANCEL", "BUYER_ORDER_CANCEL_REQUEST", "BUYER_ORDER_COPY_ID", "BUYER_ORDER_INQUIRY_RECONTACT_CLAIM", "BUYER_ORDER_RETURN", "BUYER_ORDER_UPDATE", "BUYER_ORDER_UPDATE_REQUEST", "BUYER_RELIST", "BUYER_SEE_RETURN_DETAILS", "BUYER_VISIT_THIS_SHOP", "CANCEL", "CANCEL_REQUEST", "CANCEL_SUBSCRIPTION", "CHANGE_ITEM_QUANTITY", "CHANGE_SHIPPING_ADDRESS", "CHANGE_SUBSCRIPTION_CREDENTIAL", "CHECKOUT_OFFER_STATUS_BUY_FOR_LISTING_PRICE", "CHECKOUT_OFFER_STATUS_MAKE_ANOTHER_OFFER"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"CHECKOUT_OFFER_STATUS_VIEW_ORDER", "CLAIM_CREATION", "CLAIM_TICKET", "CLICK_BANNER", "CLOSE_BANNER", "COMMERCE_PAY_REQUEST", "CONFIRM_ORDER", "CONFIRM_PICKUP", "CONTACT_CUSTOMER_SUPPORT", "CONTACT_FACEBOOK_SUPPORT", "CO_CHANGED_MY_MIND", "CO_CHANGE_PAYMENT_METHOD", "CO_CHANGE_SHIPPING_ADDRESS", "CO_FOUND_A_BETTER_PRICE", "CO_ORDERED_BY_ACCIDENT", "CO_SOMETHING_ELSE", "CS_CONTACT_MERCHANT", "CS_CONTACT_MERCHANT_DAMAGED_NOT_AS_DESCRIBED_ORDER", "CS_CONTACT_MERCHANT_LATE_OR_MISSING_ORDER", "CS_CONTACT_MERCHANT_ORDER_MADE_BY_MISTAKE", "CS_CONTACT_MERCHANT_ORDER_MADE_BY_OTHERS", "CS_CONTACT_MERCHANT_ORDER_MADE_BY_OTHERS_I_KNOW", "CS_CONTACT_MERCHANT_OTHER_QUESTION", "CS_GENERAL_INQUIRY", "CS_MESSAGE_MERCHANT_ABOUT_ITEM", "CS_RECONTACT_ESCALATE", "CS_RECONTACT_MARK_AS_RESOLVED"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"CS_RECONTACT_MARK_AS_UNRESOLVED", "CS_UNAUTHORIZED_ORDER", "DECLINE_ORDER", "EARLY_CLAIM_CREATION", "EDIT_SUBSCRIPTION_CREDIT_CARD", "GET_HELP", "GO_TO_FACEBOOK_PAY", "GO_TO_MESSAGE_THREAD", "GO_TO_REWARDS_WALLET", "GROUP_PAYMENT_GIFT_CLAIM", "HAS_CONTACTED_SELLER", "HAS_NOT_CONTACTED_SELLER", "HELP_CENTER_SUBSCRIPTION", "INVITE", "ISSUE_RESOLVED", "ITEM_DAMAGED_DEFECTIVE", "ITEM_DAMAGED_OR_NOT_AS_DESCRIBED", "ITEM_LATE_OR_MISSING", "ITEM_NOT_AS_DESCRIBED", "LATE_CLAIM_CREATION", "LATE_OR_MISSING", "LAUNCH_IDENTITY_VERIFICATION", "MAKE_CHANGES_TO_ITEM", "MANAGE_SUBSCRIPTION", "MANAGE_TICKET_THROUGH_THIRD_PARTY", "MARK_AS_PAID", "MARK_AS_SHIPPED"}, 0, strArr, 54, 27);
        System.arraycopy(new String[]{"MCOM_ADD_SHIPPING_INFO", "MCOM_CANCEL", "MCOM_EXPAND_ACTIONS", "MCOM_GENERAL_LINK", "MCOM_LEAVE_RATING", "MCOM_MAKE_PAYMENT", "MCOM_MANAGE_DISPUTE", "MCOM_MARK_AS_PAID", "MCOM_MARK_AS_RECEIVED", "MCOM_MARK_AS_SHIPPED", "MCOM_MESSAGE_SELLER", "MCOM_ORDER_CONFIRMED", "MCOM_ORDER_NOT_DELIVERED", "MCOM_RECEIPT_ATTACHED", "MCOM_RECEIVED_BUT_DAMAGED", "MCOM_RECEIVED_BUT_NOT_AS_DESCRIBED", "MCOM_REMIND_BUYER", "MCOM_REPORT_TO_FB", "MCOM_REQUEST_PAYMENT", "MCOM_SEE_DETAILS", "MCOM_SEND_MESSAGE", "MCOM_SEND_REFUND", "MCOM_START_DISPUTE", "MFS_CANCEL_TRANSFER", "MFS_CONTACT_SUPPORT", "MFS_DECLINE_TRANSFER", "MFS_DEEPLINK"}, 0, strArr, 81, 27);
        System.arraycopy(new String[]{"MFS_MANAGE_MONEY", "MFS_OPEN_NUX", "OPEN_PURCHASE_PROTECTION_CLAIM", "OPP_UPDATE_CARD", "ORDER_CANCELED", "P2M_MARK_AS_X", "P2M_SEND_OR_REFRESH_MESSAGE", "P2P_ACCEPT_MONEY", "P2P_CANCEL_REQUEST", "P2P_DECLINE_REQUEST", "P2P_DECLINE_TRANSFER", "P2P_DISMISS_FLOW", "P2P_GENERAL_CONTINUE", "P2P_GENERAL_LINK", "P2P_OPEN_DIALOG", "P2P_OPEN_RECEIPT", "P2P_PAY_REQUEST", "P2P_TRIGGER_RECEIVE", "P2P_UPDATE_CARD", "P2P_VERIFY_INFO", "PAUSE_SUBSCRIPTION", "PAYMENT_CAPTURE_FAILURE", "PAY_CONFIRMATION_CONFIGURATION_DONE", "PAY_CONFIRMATION_CONFIGURATION_SETUP_FBPAY_PIN", "PAY_CONFIRMATION_CONFIGURATION_VIEW_DETAILS", "PURCHASE_PROTECTION", "RECEIPT_STATUS_COMPONENT"}, 0, strArr, 108, 27);
        System.arraycopy(new String[]{"REQUEST_CANCELLATION", "REQUEST_NEW_RECEIPT", "REQUEST_REFUND", "REQUEST_RETURN", "RESTART_SUBSCRIPTION", "RESTORE_SUBSCRIPTION", "RESUBSCRIBE_SUBSCRIPTION", "REVOKE_AND_REFUND_SUBSCRIPTION", "SELLER_CHARGEBACK_REPRESENTMENT", "SELLER_CLAIM_APPEALS", "SHARE", "SUPPORT_EXPERIENCE_RATING_SUBMITTED", "TRACK", "UNKNOWN_OR_SUSPICIOUS", "UNPAUSE_SUBSCRIPTION", "UPDATE_EMAIL", "UPDATE_ORDER", "UPDATE_PAYMENT_METHOD", "UPDATE_SHIPPING_ADDRESS", "VIEW_CLAIMS", "VIEW_CLAIM_REDIRECT", "VIEW_CLOSED_CLAIM", "VIEW_GIFTCARD", "VIEW_ITEM", "VIEW_MERCHANT_INFORMATION", "VIEW_MERCHANT_TERMS", "VIEW_NO_PP_CLAIM"}, 0, strArr, ActionId.MQTT_CONNECTING, 27);
        A00 = DKF.A0w(new String[]{"VIEW_OPEN_CLAIM", "VIEW_ORDER", "VIEW_ORDERS", "VIEW_ORDER_DETAILS", "VIEW_PDP", "VIEW_RECEIPT", "VIEW_REFUNDED_CLAIM", "VIEW_RETURN_LABEL", "VIEW_SELLER", "VIEW_SHOP_ORDER", "WRITE_REVIEW"}, strArr, 0, ActionId.ASYNC_FAIL, 11);
    }

    public static final Set getSet() {
        return A00;
    }
}
