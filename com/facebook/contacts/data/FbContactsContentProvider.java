package com.facebook.contacts.data;

import X.0Pz;
import X.0RF;
import X.0fH;
import X.1Bi;
import X.1Bn;
import X.1Du;
import X.1JF;
import X.3zF;
import X.AnonymousClass001;
import X.C00i;
import X.C00j;
import X.C0ev;
import X.C0ew;
import X.C0ex;
import X.C0ey;
import X.C2eb;
import X.C2ee;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.secure.content.SecureContentDelegateDI;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: FbContactsContentProvider.class */
public class FbContactsContentProvider extends 0RF {

    /* loaded from: FbContactsContentProvider$Impl.class */
    public class Impl extends SecureContentDelegateDI {
        public C0ev A00;
        public C0ew A01;
        public C0ex A02;
        public C0ey A03;
        public 3zF A04;
        public final C00i A05;
        public final C00i A06;
        public final C00i A07;
        public final C00i A08;
        public volatile ImmutableMap A09;
        public volatile ImmutableMap A0A;
        public volatile ImmutableMap A0B;

        public Impl(0RF r302) {
            super(r302);
            this.A06 = 1Bi.A00(16831);
            this.A08 = 1Bn.A03(67383);
            this.A07 = 1Bi.A00(17058);
            this.A05 = 1Bn.A03(67519);
        }

        public ImmutableMap A00() {
            if (this.A09 == null) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("_id", "_id");
                builder.put("fbid", "fbid");
                builder.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                builder.put("link_type", "link_type");
                builder.put("communication_rank", "communication_rank");
                builder.put("with_tagging_rank", "with_tagging_rank");
                builder.put("is_messenger_user", "is_messenger_user");
                builder.put("is_on_viewer_contact_list", "is_on_viewer_contact_list");
                builder.put("contact_relationship_status", "contact_relationship_status");
                builder.put("viewer_connection_status", "viewer_connection_status");
                builder.put("viewer_ig_follow_status", "viewer_ig_follow_status");
                builder.put("add_source", "add_source");
                builder.put("is_broadcast_recipient_holdout", "is_broadcast_recipient_holdout");
                builder.put("sort_name_key", "sort_name_key");
                builder.put("phonebook_section_key", "phonebook_section_key");
                builder.put("data", "data");
                builder.put("first_name", "first_name");
                builder.put("last_name", "last_name");
                builder.put("display_name", "display_name");
                builder.put("small_picture_url", "small_picture_url");
                builder.put("big_picture_url", "big_picture_url");
                builder.put("huge_picture_url", "huge_picture_url");
                builder.put("small_picture_size", "small_picture_size");
                builder.put("big_picture_size", "big_picture_size");
                builder.put("huge_picture_size", "huge_picture_size");
                builder.put("is_mobile_pushable", "is_mobile_pushable");
                builder.put("messenger_install_time_ms", "messenger_install_time_ms");
                builder.put("added_time_ms", "added_time_ms");
                builder.put("last_fetch_time_ms", "last_fetch_time_ms");
                builder.put("is_indexed", "is_indexed");
                builder.put("bday_month", "bday_month");
                builder.put("bday_day", "bday_day");
                builder.put("is_partial", "is_partial");
                builder.put("messenger_invite_priority", "messenger_invite_priority");
                builder.put("is_memorialized", "is_memorialized");
                builder.put("is_aloha_proxy_confirmed", "is_aloha_proxy_confirmed");
                builder.put("aloha_proxy_user_owners", "aloha_proxy_user_owners");
                builder.put("is_message_ignored_by_viewer", "is_message_ignored_by_viewer");
                builder.put("favorite_color", "favorite_color");
                builder.put("is_viewer_managing_parent", "is_viewer_managing_parent");
                builder.put("work_info", "work_info");
                builder.put("is_managing_parent_approved_user", "is_managing_parent_approved_user");
                builder.put("nickname_for_viewer", "nickname_for_viewer");
                builder.put("restriction_type", "restriction_type");
                builder.put("mentions_messenger_sharing_score", "mentions_messenger_sharing_score");
                builder.put("avatar_id", "avatar_id");
                builder.put("is_avatar_public_and_usable_by_viewer", "is_avatar_public_and_usable_by_viewer");
                builder.put("avatar_preview_uri", "avatar_preview_uri");
                this.A09 = builder.build();
            }
            return this.A09;
        }

        public ImmutableMap A01() {
            if (this.A0A == null) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("PHONE_LOCAL", "phone_local");
                builder.put("PHONE_NATIONAL", "phone_national");
                builder.put("PHONE_E164", "phone_e164");
                builder.put("PHONE_VERIFIED", "phone_verified");
                this.A0A = builder.build();
            }
            return this.A0A;
        }

        public ImmutableMap A02() {
            if (this.A0B == null) {
                ImmutableMap.Builder builder = ImmutableMap.builder();
                builder.put("raw_phone_number", "raw_phone_number");
                builder.put("display_order", "display_order");
                this.A0B = builder.build();
            }
            return this.A0B;
        }

        public static String A06(Impl impl, String str) {
            if (str == null) {
                str = "";
            }
            1Du it = impl.A00().keySet().iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                if (str.contains(A0i)) {
                    return A0i;
                }
            }
            return null;
        }

        public static String A07(String str, String str2) {
            if (str2 == null || "_id".equals(str2)) {
                if (!1JF.A0B(str)) {
                    return 0Pz.A0W(str, " AND is_indexed = 1");
                }
                str = "is_indexed = 1";
            }
            return str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
        
            if (X.C2ee.A01.contains(r302) != false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.lang.String A08(java.lang.String r302, java.lang.String r303, java.lang.StringBuilder r304) {
            /*
                r301 = this;
                r0 = r302
                if (r0 == 0) goto L18
                com.google.common.collect.ImmutableSet r0 = X.C2ee.A01
                r1 = r302
                boolean r0 = r0.contains(r1)
                r305 = r0
                r0 = 0
                r306 = r0
                r0 = 0
                r307 = r0
                r0 = r305
                if (r0 == 0) goto L1b
            L18:
                r0 = 1
                r306 = r0
            L1b:
                r0 = r306
                com.google.common.base.Preconditions.checkState(r0)
                r0 = r302
                if (r0 == 0) goto L75
                java.lang.String r0 = "_id"
                r307 = r0
                r0 = r307
                r1 = r302
                boolean r0 = r0.equals(r1)
                r306 = r0
                r0 = r306
                if (r0 != 0) goto L75
                r0 = r301
                com.google.common.collect.ImmutableMap r0 = r0.A00()
                r1 = r302
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r0 = (java.lang.String) r0
                r308 = r0
                r0 = r304
                java.lang.String r1 = ", idx.indexed_data AS "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r304
                r1 = r308
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r303
                java.lang.StringBuilder r0 = X.AnonymousClass001.A0n(r0)
                r309 = r0
                r0 = r309
                java.lang.String r1 = " AS c INNER JOIN contacts_indexed_data AS idx ON (c.internal_id = idx.contact_internal_id AND idx.type = '"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r309
                r1 = r308
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = "') "
                r307 = r0
            L6d:
                r0 = r307
                r1 = r309
                java.lang.String r0 = X.AnonymousClass001.A0d(r0, r1)
                return r0
            L75:
                r0 = r303
                java.lang.StringBuilder r0 = X.AnonymousClass001.A0n(r0)
                r309 = r0
                java.lang.String r0 = " AS c "
                r307 = r0
                goto L6d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.contacts.data.FbContactsContentProvider.Impl.A08(java.lang.String, java.lang.String, java.lang.StringBuilder):java.lang.String");
        }

        public static void A09(StringBuilder sb, String str) {
            if ("_id".equals(str)) {
                return;
            }
            if (!"data".equals(str) && !"is_indexed".equals(str) && !C2ee.A00.contains(str)) {
                throw 0Pz.A05("Unknown field: ", str);
            }
            sb.append(", c.");
            sb.append(str);
            sb.append(" AS ");
            sb.append(str);
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0U(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public int A0V(Uri uri, String str, String[] strArr) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Cursor A0X(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            C00j.A05("FbContactsContentProvider.doQuery", -646294489);
            try {
                Cursor A04 = this.A04.A00(uri).A04(uri, strArr, str, strArr2, str2);
                0fH.A0g(Long.valueOf(C00j.A00(2111945730)), "FbContactsContentProvider", "FbContactsContentProvider.doQuery took %d ms");
                return A04;
            } catch (Throwable th) {
                0fH.A0g(Long.valueOf(C00j.A00(-1198524998)), "FbContactsContentProvider", "FbContactsContentProvider.doQuery took %d ms");
                throw th;
            }
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public Uri A0Y(Uri uri, ContentValues contentValues) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public String A0a(Uri uri) {
            throw AnonymousClass001.A0p();
        }

        @Override // com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public void A0b() {
            synchronized (this) {
                C00j.A05("ContactsContentProvider.onInitialize", -1635731484);
                try {
                    this.A00 = new C0ev(this);
                    this.A03 = new C0ey(this);
                    this.A02 = new C0ex(this);
                    this.A01 = new C0ew(this);
                    3zF r0 = new 3zF();
                    this.A04 = r0;
                    C00i c00i = this.A07;
                    r0.A01(this.A00, ((C2eb) c00i.get()).A08, "contacts_with_fbids");
                    this.A04.A01(this.A03, ((C2eb) c00i.get()).A08, "sms_favorites");
                    this.A04.A01(this.A02, ((C2eb) c00i.get()).A08, "search");
                    this.A04.A01(this.A02, ((C2eb) c00i.get()).A08, "search/");
                    this.A04.A01(this.A02, ((C2eb) c00i.get()).A08, "search/*");
                    this.A04.A01(this.A02, ((C2eb) c00i.get()).A08, "search/*/*");
                    this.A04.A01(this.A01, ((C2eb) c00i.get()).A08, "contact_index");
                    C00j.A01(-463834669);
                } catch (Throwable th) {
                    C00j.A01(2039584634);
                    throw th;
                }
            }
        }

        public String A0e(String str, String str2, String str3, String[] strArr) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Collections.addAll(linkedHashSet, strArr);
            if (str2 == null) {
                str2 = "";
            }
            1Du it = A00().keySet().iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                if (str2.contains(A0i)) {
                    linkedHashSet.add(A0i);
                }
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("c.internal_id AS _id");
            String A08 = A08(str3, str, A0k);
            if (str3 != null) {
                linkedHashSet.remove(str3);
            }
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                A09(A0k, AnonymousClass001.A0i(it2));
            }
            StringBuilder A0o = AnonymousClass001.A0o("(SELECT ");
            A0o.append((CharSequence) A0k);
            A0o.append(" FROM ");
            A0o.append(A08);
            return AnonymousClass001.A0d(")", A0o);
        }
    }
}
