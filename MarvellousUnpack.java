
//MarvellousUnpacke.java

import java.io.BufferedReader;
import java.io.file;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;.
import java.nio.file.Paths;
import java.nio.FileInputStream;
import java.nio.FileOutputStream;

public class MarvellousUnpack
{
    FileOutputStream outstream = null;

    public MarvellousUnpack(String stc) throws Exception
    {
        unpack(src);
    }

    public void unpack(String filePath)throws Exception
    {
        try
        {
            FileInputStream = new FileInputStreame(filePath);

            byte header[] = new byte[100];
            int length = 0;

            byyte Magic[]= new byte[12];
            instream.read(Magic,0,Magic.length);

            String Magicstr = new String(MAgic);

            if(!Magicstr.equals("Marvellous11"))
            {
                throw new InvalidFileException("Invalid Packed File Format");
            }

            while((length = instream.read(header,0,100))>0)
            {
                String str = new String(header);

                String ext = str.substring(str.lastIdexOf("/"));
                ext = ext.substring(1);

                String[]words = ext.split("\\s");

                String filename = words[0];

                int size = Integer.parseInt(words[1]);

                byte arr[] = new byte[size];

                instream.read(arr,0,size);

                FileOutputStream four = new FileOutputStream(filename);
                fout.write(arr,0,size);
            }
        }
        catch(Exception obj)
        {
            throw new InvalidFileException("Invalid Pack Format");
        }
        catch(Exception e)
       {}
    }
}