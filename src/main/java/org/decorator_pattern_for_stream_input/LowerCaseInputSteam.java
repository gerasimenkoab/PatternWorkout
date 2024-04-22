package org.decorator_pattern_for_stream_input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputSteam extends FilterInputStream {
    public LowerCaseInputSteam(InputStream in){
        super(in);
    }
    //implement read method
    public int read()throws IOException{
        int c = in.read();
        return(c==-1 ? c:Character.toLowerCase((char)c));
    }

    public int read(byte[] b, int offcet, int len)throws IOException{
        int result = in.read(b, offcet, len);
        for(int i = offcet; i < offcet+result; i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
