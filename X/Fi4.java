package X;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.contacts.model.PhonebookAddress;
import com.facebook.contacts.model.PhonebookContact;
import com.facebook.contacts.model.PhonebookContactMetadata;
import com.facebook.contacts.model.PhonebookEmailAddress;
import com.facebook.contacts.model.PhonebookEvent;
import com.facebook.contacts.model.PhonebookInstantMessaging;
import com.facebook.contacts.model.PhonebookNickname;
import com.facebook.contacts.model.PhonebookOrganization;
import com.facebook.contacts.model.PhonebookPhoneNumber;
import com.facebook.contacts.model.PhonebookRelation;
import com.facebook.contacts.model.PhonebookWebsite;
import com.facebook.contacts.model.PhonebookWhatsappProfile;
import com.facebook.contacts.server.UploadBulkContactChange;
import com.facebook.contacts.server.UploadFriendFinderContactsParams;
import com.facebook.contacts.server.UploadFriendFinderContactsResult;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fi4.class */
public final class Fi4 implements 1Ro {
    public static final SimpleDateFormat A05;
    public static final SimpleDateFormat A06;
    public static final Calendar A07;
    public static final String __redex_internal_original_name = "UploadFriendFinderContactsMethod";
    public 1BY A00;
    public final Context A01;
    public final TelephonyManager A02;
    public final EcW A03;
    public final AnonymousClass259 A04;

    static {
        Locale locale = Locale.US;
        A05 = new SimpleDateFormat("yyyy-MM-dd", locale);
        A06 = new SimpleDateFormat("--MM-dd", locale);
        A07 = Calendar.getInstance();
    }

    public Fi4(1BO r302) {
        Context A0J = 7zP.A0J();
        this.A01 = A0J;
        this.A03 = (EcW) 1Bn.A0B(99372);
        this.A04 = (AnonymousClass259) 1Bn.A0B(68337);
        this.A02 = (TelephonyManager) 1Hv.A02(A0J, 100178);
        this.A00 = 7zL.A0Q(r302);
    }

    public static void A00(28Q r301, String str, String str2) {
        if (1JF.A0B(str2)) {
            return;
        }
        try {
            r301.A0o(str);
            r301.A0r(str2);
        } catch (IOException e) {
            0fH.A0P(Fi4.class, "Got IOException when adding contact field key %s value %s", e, new Object[]{str, str2});
        }
    }

    public static void A01(2DM r301, String str, String str2) {
        if (1JF.A0B(str2)) {
            return;
        }
        r301.A0o(str, str2);
    }

    public static void A02(Throwable th, Object... objArr) {
        0fH.A0P(Fi4.class, "Got Exception when %s for contact %s", th, objArr);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        PhonebookContact phonebookContact;
        Calendar calendar;
        String str;
        UploadFriendFinderContactsParams uploadFriendFinderContactsParams = (UploadFriendFinderContactsParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        String str2 = uploadFriendFinderContactsParams.A03;
        if (str2 != null) {
            A0s.add(new BasicNameValuePair("import_id", str2));
        }
        TelephonyManager telephonyManager = this.A02;
        String simCountryIso = telephonyManager.getSimCountryIso();
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (!1JF.A0B(simCountryIso)) {
            A0s.add(new BasicNameValuePair("sim_country", simCountryIso));
        }
        if (!1JF.A0B(networkCountryIso)) {
            A0s.add(new BasicNameValuePair("network_country", networkCountryIso));
        }
        Integer num = uploadFriendFinderContactsParams.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "CONTINUOUS_SYNC";
                    break;
                case 2:
                    str = "QUICK_PROMOTION";
                    break;
                default:
                    str = "CONTACT_IMPORTER";
                    break;
            }
            A0s.add(new BasicNameValuePair("flow", str));
        }
        A0s.add(new BasicNameValuePair("is_full_upload", String.valueOf(uploadFriendFinderContactsParams.A04)));
        ImmutableList immutableList = uploadFriendFinderContactsParams.A00;
        StringWriter stringWriter = new StringWriter();
        3sP A072 = this.A04.A07(stringWriter);
        A072.A0a();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            UploadBulkContactChange uploadBulkContactChange = (UploadBulkContactChange) it.next();
            try {
                A072.A0b();
                String str3 = uploadBulkContactChange.A02;
                A072.A0o("record_id");
                A072.A0r(str3);
                Qo9 qo9 = uploadBulkContactChange.A01;
                int ordinal = qo9.ordinal();
                String str4 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? null : "2" : ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT;
                A072.A0o("modifier");
                A072.A0r(str4);
                String str5 = uploadBulkContactChange.A03;
                A072.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                A072.A0r(str5);
                if (qo9 != Qo9.A02) {
                    phonebookContact = uploadBulkContactChange.A00;
                } else {
                    Er3 er3 = new Er3(str3);
                    er3.A00 = "None";
                    new PhonebookContact(er3);
                }
                String str6 = phonebookContact.A0C;
                if (str6 != null) {
                    A00(A072, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str6);
                }
                ImmutableList immutableList2 = phonebookContact.A07;
                if (!immutableList2.isEmpty()) {
                    C26T c26t = C26T.A00;
                    C03353xs A0k = DKC.A0k(c26t);
                    1Du it2 = immutableList2.iterator();
                    while (it2.hasNext()) {
                        PhonebookPhoneNumber phonebookPhoneNumber = (PhonebookPhoneNumber) it2.next();
                        2DM A0g = 4YU.A0g(c26t);
                        int i = phonebookPhoneNumber.A00;
                        A0g.A0o("label", i == 1 ? "home" : i == 3 ? "work" : i == 2 ? "mobile" : i == 5 ? "fax_home" : i == 4 ? "fax_work" : i == 13 ? "fax_other" : i == 6 ? "pager" : "other");
                        A0g.A0o("raw", phonebookPhoneNumber.A00);
                        A0k.A0d(A0g);
                    }
                    try {
                        A072.A0o("phones");
                        A072.A0P(A0k);
                    } catch (IOException e) {
                        A02(e, "appendPhonebookPhoneNumber", phonebookContact.A0B);
                    }
                }
                ImmutableList immutableList3 = phonebookContact.A02;
                if (!immutableList3.isEmpty()) {
                    C26T c26t2 = C26T.A00;
                    C03353xs A0k2 = DKC.A0k(c26t2);
                    1Du it3 = immutableList3.iterator();
                    while (it3.hasNext()) {
                        PhonebookEmailAddress phonebookEmailAddress = (PhonebookEmailAddress) it3.next();
                        2DM A0g2 = 4YU.A0g(c26t2);
                        int i2 = phonebookEmailAddress.A00;
                        A0g2.A0o("label", i2 == 1 ? "home" : i2 == 2 ? "work" : "other");
                        A0g2.A0o("raw", phonebookEmailAddress.A00);
                        A0k2.A0d(A0g2);
                    }
                    try {
                        A072.A0o("emails");
                        A072.A0P(A0k2);
                    } catch (IOException e2) {
                        A02(e2, "appendPhonebookEmailAddress", phonebookContact.A0B);
                    }
                }
                A00(A072, "photo", phonebookContact.A0M ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
                A00(A072, "note", phonebookContact.A0L ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
                A00(A072, "first_name", phonebookContact.A0E);
                A00(A072, "last_name", phonebookContact.A0D);
                A00(A072, "prefix", phonebookContact.A0J);
                A00(A072, "middle_name", phonebookContact.A0F);
                A00(A072, "suffix", phonebookContact.A0K);
                A00(A072, "phonetic_first_name", phonebookContact.A0H);
                A00(A072, "phonetic_last_name", phonebookContact.A0G);
                A00(A072, "phonetic_middle_name", phonebookContact.A0I);
                ImmutableList immutableList4 = phonebookContact.A04;
                if (!immutableList4.isEmpty()) {
                    C26T c26t3 = C26T.A00;
                    C03353xs A0k3 = DKC.A0k(c26t3);
                    1Du it4 = immutableList4.iterator();
                    while (it4.hasNext()) {
                        PhonebookInstantMessaging phonebookInstantMessaging = (PhonebookInstantMessaging) it4.next();
                        2DM A0g3 = 4YU.A0g(c26t3);
                        int i3 = phonebookInstantMessaging.A00;
                        A0g3.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i3 == 1 ? "home" : i3 == 2 ? "work" : "other");
                        A01(A0g3, "data", phonebookInstantMessaging.A01);
                        A01(A0g3, "label", phonebookInstantMessaging.A01);
                        A01(A0g3, TraceFieldType.Protocol, phonebookInstantMessaging.A02);
                        A01(A0g3, "custom_protocol", phonebookInstantMessaging.A00);
                        A0k3.A0d(A0g3);
                    }
                    try {
                        A072.A0o("instant_messaging");
                        A072.A0P(A0k3);
                    } catch (IOException e3) {
                        A02(e3, "appendPhonebookInstantMessaging", phonebookContact.A0B);
                    }
                }
                ImmutableList immutableList5 = phonebookContact.A05;
                if (!immutableList5.isEmpty()) {
                    C26T c26t4 = C26T.A00;
                    C03353xs A0k4 = DKC.A0k(c26t4);
                    1Du it5 = immutableList5.iterator();
                    while (it5.hasNext()) {
                        PhonebookNickname phonebookNickname = (PhonebookNickname) it5.next();
                        2DM A0g4 = 4YU.A0g(c26t4);
                        int i4 = phonebookNickname.A00;
                        A0g4.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i4 == 1 ? "default" : i4 == 3 ? "maiden" : i4 == 5 ? "initials" : i4 == 4 ? "short" : "other");
                        A01(A0g4, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, phonebookNickname.A00);
                        A01(A0g4, "label", phonebookNickname.A01);
                        A0k4.A0d(A0g4);
                    }
                    try {
                        A072.A0o("nick_names");
                        A072.A0P(A0k4);
                    } catch (IOException e4) {
                        A02(e4, "appendPhonebookNickname", phonebookContact.A0B);
                    }
                }
                ImmutableList immutableList6 = phonebookContact.A00;
                if (!immutableList6.isEmpty()) {
                    C26T c26t5 = C26T.A00;
                    C03353xs A0k5 = DKC.A0k(c26t5);
                    1Du it6 = immutableList6.iterator();
                    while (it6.hasNext()) {
                        PhonebookAddress phonebookAddress = (PhonebookAddress) it6.next();
                        2DM A0g5 = 4YU.A0g(c26t5);
                        int i5 = phonebookAddress.A00;
                        A0g5.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i5 == 1 ? "home" : i5 == 2 ? "work" : "other");
                        A01(A0g5, "label", phonebookAddress.A01);
                        A01(A0g5, "formatted_address", phonebookAddress.A02);
                        A01(A0g5, "street", phonebookAddress.A07);
                        A01(A0g5, "po_box", phonebookAddress.A04);
                        A01(A0g5, "neighborhood", phonebookAddress.A03);
                        A01(A0g5, ServerW3CShippingAddressConstants.CITY, phonebookAddress.A00);
                        A01(A0g5, ServerW3CShippingAddressConstants.REGION, phonebookAddress.A06);
                        A01(A0g5, "post_code", phonebookAddress.A05);
                        A01(A0g5, "country", phonebookAddress.A01);
                        A0k5.A0d(A0g5);
                    }
                    try {
                        A072.A0o("address");
                        A072.A0P(A0k5);
                    } catch (IOException e5) {
                        A02(e5, "appendPhonebookAddress", phonebookContact.A0B);
                    }
                }
                ImmutableList immutableList7 = phonebookContact.A09;
                if (!immutableList7.isEmpty()) {
                    C26T c26t6 = C26T.A00;
                    C03353xs A0k6 = DKC.A0k(c26t6);
                    1Du it7 = immutableList7.iterator();
                    while (it7.hasNext()) {
                        PhonebookWebsite phonebookWebsite = (PhonebookWebsite) it7.next();
                        2DM A0g6 = 4YU.A0g(c26t6);
                        int i6 = phonebookWebsite.A00;
                        A0g6.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i6 == 1 ? "homepage" : i6 == 2 ? "blog" : i6 == 3 ? "profile" : i6 == 4 ? "home" : i6 == 5 ? "work" : i6 == 6 ? "ftp" : "other");
                        A01(A0g6, "URL", phonebookWebsite.A00);
                        A01(A0g6, "label", phonebookWebsite.A01);
                        A0k6.A0d(A0g6);
                    }
                    try {
                        A072.A0o("website");
                        A072.A0P(A0k6);
                    } catch (IOException e6) {
                        A02(e6, "appendPhonebookWebsite", phonebookContact.A0B);
                    }
                }
                ImmutableList immutableList8 = phonebookContact.A08;
                if (!immutableList8.isEmpty()) {
                    C26T c26t7 = C26T.A00;
                    C03353xs A0k7 = DKC.A0k(c26t7);
                    1Du it8 = immutableList8.iterator();
                    while (it8.hasNext()) {
                        PhonebookRelation phonebookRelation = (PhonebookRelation) it8.next();
                        2DM A0g7 = 4YU.A0g(c26t7);
                        int i7 = phonebookRelation.A00;
                        A0g7.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i7 == 1 ? "assistant" : i7 == 2 ? "brother" : i7 == 3 ? "child" : i7 == 4 ? "domestic_partner" : i7 == 5 ? "father" : i7 == 6 ? 7zK.A00(29) : i7 == 7 ? "manager" : i7 == 8 ? "mother" : i7 == 9 ? "parent" : i7 == 10 ? "partner" : i7 == 11 ? "referred_by" : i7 == 12 ? "relative" : i7 == 13 ? "sister" : i7 == 14 ? "spouse" : "other");
                        A01(A0g7, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, phonebookRelation.A00);
                        A01(A0g7, "label", phonebookRelation.A01);
                        A0k7.A0d(A0g7);
                    }
                    try {
                        A072.A0o("relation");
                        A072.A0P(A0k7);
                    } catch (IOException e7) {
                        A02(e7, "appendPhonebookRelation", phonebookContact.A0B);
                    }
                }
                ImmutableList immutableList9 = phonebookContact.A06;
                if (!immutableList9.isEmpty()) {
                    C26T c26t8 = C26T.A00;
                    C03353xs A0k8 = DKC.A0k(c26t8);
                    1Du it9 = immutableList9.iterator();
                    while (it9.hasNext()) {
                        PhonebookOrganization phonebookOrganization = (PhonebookOrganization) it9.next();
                        2DM A0g8 = 4YU.A0g(c26t8);
                        A0g8.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, phonebookOrganization.A00 == 1 ? "work" : "other");
                        A01(A0g8, "label", phonebookOrganization.A01);
                        A01(A0g8, "company", phonebookOrganization.A00);
                        A01(A0g8, "department", phonebookOrganization.A01);
                        A01(A0g8, "job_title", phonebookOrganization.A06);
                        A01(A0g8, "job_description", phonebookOrganization.A02);
                        A01(A0g8, "symbol", phonebookOrganization.A05);
                        A01(A0g8, "phonetic_name", phonebookOrganization.A04);
                        A01(A0g8, "office_location", phonebookOrganization.A03);
                        A0k8.A0d(A0g8);
                    }
                    try {
                        A072.A0o("organization");
                        A072.A0P(A0k8);
                    } catch (IOException e8) {
                        A02(e8, "appendPhonebookOrganization", phonebookContact.A0B);
                    }
                }
                ImmutableList immutableList10 = phonebookContact.A01;
                if (!immutableList10.isEmpty()) {
                    C26T c26t9 = C26T.A00;
                    C03353xs A0k9 = DKC.A0k(c26t9);
                    1Du it10 = immutableList10.iterator();
                    while (it10.hasNext()) {
                        PhonebookContactMetadata phonebookContactMetadata = (PhonebookContactMetadata) it10.next();
                        2DM A0g9 = 4YU.A0g(c26t9);
                        A0g9.A0o("number_times_contacted", String.valueOf(phonebookContactMetadata.A01));
                        A0g9.A0o("starred", phonebookContactMetadata.A08 ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
                        A0g9.A0o("last_time_contacted", String.valueOf(phonebookContactMetadata.A02));
                        A0g9.A0o("custom_ringtone", phonebookContactMetadata.A04 ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
                        A0g9.A0o("in_visible_group", phonebookContactMetadata.A05 ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
                        A0g9.A0o("send_to_voicemail", phonebookContactMetadata.A07 ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
                        A0g9.A0o("is_user_profile", phonebookContactMetadata.A06 ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
                        A01(A0g9, "contact_id", phonebookContactMetadata.A03);
                        A01(A0g9, "account_type", phonebookContactMetadata.A00);
                        A0k9.A0d(A0g9);
                    }
                    try {
                        A072.A0o("meta_data");
                        A072.A0P(A0k9);
                    } catch (IOException e9) {
                        A02(e9, "appendPhonebookContactMetadata", phonebookContact.A0B);
                    }
                }
                ImmutableList immutableList11 = phonebookContact.A03;
                if (!immutableList11.isEmpty()) {
                    C26T c26t10 = C26T.A00;
                    C03353xs A0k10 = DKC.A0k(c26t10);
                    1Du it11 = immutableList11.iterator();
                    while (it11.hasNext()) {
                        PhonebookEvent phonebookEvent = (PhonebookEvent) it11.next();
                        2DM A0g10 = 4YU.A0g(c26t10);
                        int i8 = phonebookEvent.A00;
                        A0g10.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i8 == 1 ? "anniversary" : i8 == 3 ? "birthday" : "other");
                        A01(A0g10, "label", phonebookEvent.A01);
                        try {
                            String str7 = phonebookEvent.A00;
                            if (str7.length() == 7) {
                                calendar = A07;
                                calendar.setTimeInMillis(A06.parse(str7).getTime());
                            } else {
                                calendar = A07;
                                calendar.setTimeInMillis(A05.parse(str7).getTime());
                                PhonebookContactMetadata phonebookContactMetadata2 = (PhonebookContactMetadata) 2Ri.A0D(immutableList10, (Object) null);
                                if (phonebookContactMetadata2 == null || !phonebookContactMetadata2.A06) {
                                    A0g10.A0o("date", String.valueOf(4YU.A06(calendar.getTimeInMillis())));
                                    A0g10.A0o("year", String.valueOf(calendar.get(1)));
                                }
                            }
                            A0g10.A0o("month", String.valueOf(calendar.get(2) + 1));
                            A0g10.A0o("day", String.valueOf(calendar.get(5)));
                        } catch (ParseException e10) {
                            A02(e10, "appendPhonebookEvent", phonebookContact.A0B);
                        }
                        A0k10.A0d(A0g10);
                    }
                    try {
                        A072.A0o("event");
                        A072.A0P(A0k10);
                    } catch (IOException e11) {
                        A02(e11, "appendPhonebookEvent", phonebookContact.A0B);
                    }
                }
                ImmutableList immutableList12 = phonebookContact.A0A;
                if (!immutableList12.isEmpty()) {
                    C26T c26t11 = C26T.A00;
                    C03353xs A0k11 = DKC.A0k(c26t11);
                    1Du it12 = immutableList12.iterator();
                    while (it12.hasNext()) {
                        PhonebookWhatsappProfile phonebookWhatsappProfile = (PhonebookWhatsappProfile) it12.next();
                        2DM A0g11 = 4YU.A0g(c26t11);
                        A0g11.A0o("username", phonebookWhatsappProfile.A01);
                        A0g11.A0o("phone_number", phonebookWhatsappProfile.A00);
                        A0k11.A0d(A0g11);
                    }
                    try {
                        A072.A0o("whatsapp_profile");
                        A072.A0P(A0k11);
                    } catch (IOException e12) {
                        A02(e12, "appendPhonebookWhatsappProfile", phonebookContact.A0B);
                    }
                }
                A072.A0Y();
            } catch (IOException e13) {
                A02(e13, "appendContactChange", uploadBulkContactChange.A02);
            }
        }
        A072.A0X();
        A072.flush();
        A0s.add(new BasicNameValuePair("contacts", stringWriter.toString()));
        A0s.add(new BasicNameValuePair("android_id", Settings.Secure.getString(this.A01.getContentResolver(), "android_id")));
        A0s.add(new BasicNameValuePair("phone_id", this.A03.A00.A04(C1fe.A0Z)));
        String str8 = uploadFriendFinderContactsParams.A02;
        if (!1JF.A0B(str8)) {
            A0s.add(new BasicNameValuePair("contacts_upload_protocol_source", str8));
        }
        return new C04103zy(0S2.A01, "FriendFinderMobileContinuousSync", "POST", "method/friendFinder.mobilecontinuoussync", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A01 = anonymousClass439.A01();
        0fH.A07(Fi4.class, A01, "Got response: %s");
        String A18 = AbK.A18(A01, "import_id");
        int A02 = JSONUtil.A02(A01.A0D("server_status"), 0);
        Qpy qpy = Qpy.A04;
        if (A02 < Qpy.values().length) {
            qpy = Qpy.values()[A02];
        }
        return new UploadFriendFinderContactsResult(qpy, A18);
    }
}
