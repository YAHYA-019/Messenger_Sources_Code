package X;

import android.content.ContentValues;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;

/* loaded from: Cex.class */
public final class Cex implements DHw {
    public final long A00;
    public final ImmutableList.Builder A01 = ImmutableList.builder();

    public Cex(long j) {
        this.A00 = j;
    }

    @Override // X.DHw
    public void A5h(String str, float f) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        contentValues.put("indexed_data", Float.valueOf(f));
        contentValues.put("contact_internal_id", Long.valueOf(this.A00));
        this.A01.m11011add((Object) contentValues);
    }

    @Override // X.DHw
    public void A6I(String str, long j) {
        String A00 = AnonymousClass000.A00(84);
        ContentValues contentValues = new ContentValues(3);
        contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A00);
        contentValues.put("indexed_data", Long.valueOf(j));
        contentValues.put("contact_internal_id", Long.valueOf(this.A00));
        this.A01.m11011add((Object) contentValues);
    }

    @Override // X.DHw
    public void A7S(String str, String str2) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        contentValues.put("indexed_data", str2);
        contentValues.put("contact_internal_id", Long.valueOf(this.A00));
        this.A01.m11011add((Object) contentValues);
    }
}
