package com.facebook.msys.mcp.loadgeneratorplugin;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    private String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomDocumentPathCreateJNI(String str, int i) {
        String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomDocumentPathCreate = LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomDocumentPathCreate(str, i);
        if (LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomDocumentPathCreate == null) {
            LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomDocumentPathCreate = null;
        }
        return LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomDocumentPathCreate;
    }

    private String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomGifPathCreateJNI(int i, int i2) {
        String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomGifPathCreate = LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomGifPathCreate(i, i2);
        if (LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomGifPathCreate == null) {
            LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomGifPathCreate = null;
        }
        return LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomGifPathCreate;
    }

    private String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomImagePathCreateJNI(int i, int i2) {
        String generateRandomImage = LoadGeneratorPluginSessionless.generateRandomImage(i, i2);
        if (generateRandomImage == null) {
            generateRandomImage = null;
        }
        return generateRandomImage;
    }

    private String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomVideoPathCreateJNI(int i, int i2, int i3) {
        String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomVideoPathCreate = LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomVideoPathCreate(i, i2, i3);
        if (LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomVideoPathCreate == null) {
            LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomVideoPathCreate = null;
        }
        return LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomVideoPathCreate;
    }

    public abstract String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomDocumentPathCreate(String str, int i);

    public abstract String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomGifPathCreate(int i, int i2);

    public abstract String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomImagePathCreate(int i, int i2);

    public abstract String LoadGeneratorExtensionImpl_MLGLoadGeneratorRandomVideoPathCreate(int i, int i2, int i3);
}
