import com.sun.javafx.util.Logging;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Log.class.getName());
        FileHandler fileHandler = null;

        try{
            fileHandler = new FileHandler("LogFile");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        }catch (SecurityException e){
            logger.log(Level.SEVERE,"Не удалось создать файл лога из-за политики безопасности.",e);
        }catch (IOException e) {
            logger.log(Level.SEVERE, "Не удалоись создать файл из-за ошибки ввода-вывода", e);
        }

        logger.log(Level.INFO,"Запись лога с уровнем INFO");
        logger.log(Level.WARNING,"Запись лога с уровнем Warning");
        logger.log(Level.SEVERE,"Запись лога с уровнем SEVERE");
    }
}
