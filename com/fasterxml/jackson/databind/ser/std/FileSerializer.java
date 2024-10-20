package com.fasterxml.jackson.databind.ser.std;

import java.io.File;

/* loaded from: FileSerializer.class */
public class FileSerializer extends StdScalarSerializer {
    public FileSerializer() {
        super(File.class);
    }
}
