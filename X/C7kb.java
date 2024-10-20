package X;

import android.webkit.MimeTypeMap;
import com.facebook.privacy.e2ee.genericimpl.store.PublicKeyStoreImplKt;
import java.util.Locale;

/* renamed from: X.7kb, reason: invalid class name */
/* loaded from: 7kb.class */
public abstract class C7kb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00cc. Please report as an issue. */
    public static String A00(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        if (mimeTypeFromExtension == null) {
            String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
            boolean z = -1;
            switch (lowerCase.hashCode()) {
                case 3711:
                    if (lowerCase.equals(PublicKeyStoreImplKt.KEYS_UPDATE_TIMESTAMP)) {
                        z = false;
                        break;
                    }
                    break;
                case 96323:
                    if (lowerCase.equals("aac")) {
                        z = true;
                        break;
                    }
                    break;
                case 97669:
                    if (lowerCase.equals("bmp")) {
                        z = 2;
                        break;
                    }
                    break;
                case 102340:
                    if (lowerCase.equals("gif")) {
                        z = 3;
                        break;
                    }
                    break;
                case 105441:
                    if (lowerCase.equals("jpg")) {
                        z = 4;
                        break;
                    }
                    break;
                case 106415:
                    if (lowerCase.equals("m2t")) {
                        z = 5;
                        break;
                    }
                    break;
                case 106458:
                    if (lowerCase.equals("m4a")) {
                        z = 6;
                        break;
                    }
                    break;
                case 108272:
                    if (lowerCase.equals("mp3")) {
                        z = 7;
                        break;
                    }
                    break;
                case 108273:
                    if (lowerCase.equals("mp4")) {
                        z = 8;
                        break;
                    }
                    break;
                case 109967:
                    if (lowerCase.equals("ogg")) {
                        z = 9;
                        break;
                    }
                    break;
                case 110834:
                    if (lowerCase.equals("pdf")) {
                        z = 10;
                        break;
                    }
                    break;
                case 111145:
                    if (lowerCase.equals("png")) {
                        z = 11;
                        break;
                    }
                    break;
                case 117484:
                    if (lowerCase.equals("wav")) {
                        z = 12;
                        break;
                    }
                    break;
                case 3268712:
                    if (lowerCase.equals("jpeg")) {
                        z = 13;
                        break;
                    }
                    break;
                case 3358085:
                    if (lowerCase.equals("mpeg")) {
                        z = 14;
                        break;
                    }
                    break;
                case 3418175:
                    if (lowerCase.equals("opus")) {
                        z = 15;
                        break;
                    }
                    break;
                case 3559925:
                    if (lowerCase.equals("tiff")) {
                        z = 16;
                        break;
                    }
                    break;
                case 3645337:
                    if (lowerCase.equals("webm")) {
                        z = 17;
                        break;
                    }
                    break;
                case 3645340:
                    if (lowerCase.equals("webp")) {
                        z = 18;
                        break;
                    }
                    break;
            }
            mimeTypeFromExtension = "image/jpeg";
            switch (z) {
                case false:
                case true:
                    return "video/mp2t";
                case true:
                    return "audio/aac";
                case true:
                    return "image/x-ms-bmp";
                case true:
                    return "image/gif";
                case true:
                case true:
                    break;
                case true:
                    return "audio/m4a";
                case true:
                    return "audio/mp3";
                case true:
                    return "video/mp4";
                case true:
                    return "audio/ogg";
                case true:
                    return "application/pdf";
                case true:
                    return "image/png";
                case true:
                    return "audio/wav";
                case true:
                    return "video/mpeg";
                case true:
                    return "audio/opus";
                case true:
                    return "image/tiff";
                case true:
                    return "audio/webm";
                case true:
                    return "image/webp";
                default:
                    mimeTypeFromExtension = AnonymousClass000.A00(2);
                    break;
            }
        }
        return mimeTypeFromExtension;
    }
}
