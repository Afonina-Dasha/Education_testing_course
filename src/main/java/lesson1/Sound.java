package lesson1;

import jdk.nashorn.internal.objects.annotations.Getter;

abstract class Sound extends Animal{
   public String voice(String sound){
        return "Это животное издает звук: " + sound;
    }

}
