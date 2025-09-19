package tantros;

import arc.graphics.*;
import arc.struct.*;
import mindustry.content.Items;
import mindustry.type.*;

public class TantItems {
    public static Item
    cobalt, coralchunk;

    public static final Seq<Item> TantItems = new Seq<>();

    public static void load() {
       cobalt = new Item("1-cobalt", Color.valueOf("#abdddb")) {{
            hardness = 2;
            cost = 0.6f;
        }};

       coralchunk = new Item("2-coralchunk", Color.valueOf("#fdd780")) {{
            hardness = 2;
            cost = 0.5f;
        }};

        TantItems.addAll(
             cobalt, coralchunk   
        );
    }
}
      
