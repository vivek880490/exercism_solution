class ResistorColor {
    int colorCode(String color) {

        String colors[] = colors();
        int ans = 0;
        for(int i=0; i<colors.length; i++){
            if(colors[i] == color) ans =  i;
        }
        return ans;
    }

    String[] colors() {
          String colors[] = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        return colors;
    }
}
