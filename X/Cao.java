package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.contacts.graphql.Contact;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.Closeables;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/* loaded from: Cao.class */
public final class Cao implements 2Ad {
    public static final 1G2 A05 = 1G3.A01(1G0.A05, "contacts_db_in_bug_report");
    public final C00i A03 = AbH.A0S();
    public final CG4 A01 = (CG4) 1Bi.A03(84432);
    public final C00i A02 = 1BQ.A01();
    public final C00i A04 = 1BQ.A00();
    public final 2eT A00 = AbJ.A0G();

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        if (!1BK.A0R(this.A03).AZn(A05, false)) {
            return null;
        }
        try {
            File file2 = new File(file, "contacts_db.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                PrintWriter printWriter = new PrintWriter(fileOutputStream);
                DAr A01 = this.A01.A01(this.A00.A00("contacts db bug report"));
                while (A01.hasNext()) {
                    Contact contact = (Contact) A01.next();
                    MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(contact);
                    stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, contact.mName);
                    stringHelper.add("fbid", contact.mProfileFbid);
                    stringHelper.add("pushable", contact.mIsMobilePushable);
                    stringHelper.add("contactRelationshipStatus", contact.mContactRelationshipStatus.name());
                    printWriter.write(4YV.A0s(stringHelper, contact.mContactProfileType, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
                    printWriter.write("\n");
                }
                printWriter.flush();
                return ImmutableMap.of((Object) "contacts_db.txt", (Object) Uri.fromFile(file2).toString());
            } finally {
                Closeables.A00(fileOutputStream, false);
            }
        } catch (IOException e) {
            1BK.A09(this.A02).softReport("ContactsDbExtraFileProvider", e);
            throw e;
        }
    }

    public String getName() {
        return "ContactsDb";
    }

    public boolean isMemoryIntensive() {
        return false;
    }

    public boolean isUserIdentifiable() {
        return false;
    }

    public void prepareDataForWriting() {
    }

    public boolean shouldSendAsync() {
        return 1BK.A0N(this.A04).AZk(2342153633397670420L);
    }
}
