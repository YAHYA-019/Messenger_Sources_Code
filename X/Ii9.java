package X;

import android.net.Uri;
import com.facebook.ffmpeg.FFMpegBadDataException;
import com.facebook.ffmpeg.FFMpegMediaMetadataRetriever;
import com.facebook.videocodec.base.SphericalMetadata;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: Ii9.class */
public final class Ii9 implements 5Hf {
    public final C00i A02 = 1BQ.A02(116161);
    public final HQI A01 = (HQI) 1Bn.A0A(116381);
    public final C00i A00 = AbH.A0N();
    public final C00i A03 = 1BQ.A00();

    public HkO ARn(Uri uri) {
        SphericalMetadata sphericalMetadata;
        try {
            HnA A02 = GOn.A0K(this.A02).A02(uri, 0S2.A0C);
            try {
                HQI hqi = this.A01;
                File file = A02.A00;
                FFMpegMediaMetadataRetriever fFMpegMediaMetadataRetriever = new FFMpegMediaMetadataRetriever(hqi.A00, file.getPath());
                fFMpegMediaMetadataRetriever.initialize();
                try {
                    long durationMs = fFMpegMediaMetadataRetriever.getDurationMs();
                    int width = fFMpegMediaMetadataRetriever.getWidth();
                    int height = fFMpegMediaMetadataRetriever.getHeight();
                    int rotation = fFMpegMediaMetadataRetriever.getRotation();
                    int bitRate = fFMpegMediaMetadataRetriever.getBitRate();
                    long length = file.length();
                    int audioBitRate = fFMpegMediaMetadataRetriever.getAudioBitRate();
                    String copyright = fFMpegMediaMetadataRetriever.getCopyright();
                    String comment = fFMpegMediaMetadataRetriever.getComment();
                    String composer = fFMpegMediaMetadataRetriever.getComposer();
                    String codecType = fFMpegMediaMetadataRetriever.getCodecType();
                    SphericalMetadata sphericalMetadata2 = null;
                    String audioCodecType = C3o5.A0F(this.A03).AZk(36314498243567607L) ? fFMpegMediaMetadataRetriever.getAudioCodecType() : null;
                    try {
                        String sphericalMetadataXml = fFMpegMediaMetadataRetriever.getSphericalMetadataXml();
                        if (sphericalMetadataXml != null) {
                            try {
                                XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
                                newInstance.getClass();
                                newInstance.setNamespaceAware(true);
                                XmlPullParser newPullParser = newInstance.newPullParser();
                                newPullParser.getClass();
                                newPullParser.setInput(new StringReader(sphericalMetadataXml));
                                String str = "";
                                String str2 = "";
                                String str3 = "";
                                boolean z = false;
                                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                                    if (eventType == 3) {
                                        String name = newPullParser.getName();
                                        name.getClass();
                                        String lowerCase = name.toLowerCase(Locale.US);
                                        int hashCode = lowerCase.hashCode();
                                        if (hashCode != 688264603) {
                                            if (hashCode != 1033550429) {
                                                if (hashCode == 1135581705 && lowerCase.equals("projectiontype")) {
                                                    str = str3;
                                                }
                                            } else if (lowerCase.equals("spherical")) {
                                                z = str3.equalsIgnoreCase("true");
                                            }
                                        } else if (lowerCase.equals("stereomode")) {
                                            str2 = str3;
                                        }
                                    } else if (eventType == 4) {
                                        str3 = newPullParser.getText() == null ? "" : newPullParser.getText();
                                    } else {
                                        continue;
                                    }
                                }
                                if (z) {
                                    C1pq.A08("projectionType", str);
                                    C1pq.A08("stereoMode", str2);
                                    new SphericalMetadata(str, str2);
                                } else {
                                    sphericalMetadata = null;
                                }
                                sphericalMetadata2 = sphericalMetadata;
                                if (sphericalMetadata != null) {
                                    1UG A08 = 1BK.A08(1BK.A07(this.A00), "video_upload_spherical_metadata_found");
                                    if (A08.isSampled()) {
                                        A08.A7R("isSpherical", "true");
                                        A08.A7R("projectionType", sphericalMetadata2.A00);
                                        A08.A7R("stereoMode", sphericalMetadata2.A01);
                                        A08.BZL();
                                    }
                                }
                            } catch (Exception e) {
                                throw new Exception(e);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return new HkO(sphericalMetadata2, copyright, comment, (String) null, (String) null, codecType, audioCodecType, composer, width, height, rotation, bitRate, audioBitRate, durationMs, length);
                } finally {
                    fFMpegMediaMetadataRetriever.release();
                }
            } finally {
                A02.A00();
            }
        } catch (FFMpegBadDataException | RuntimeException e2) {
            throw new IOException(e2);
        }
    }
}
