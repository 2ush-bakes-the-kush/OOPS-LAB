class combinationsadd1b {public static void main(String[] args){
    int i,j,k,l;
        for(i=1;i<5;i++){
            for(j=1;j<5;j++){
                for(k=1;k<5;k++){
                    for(l=1;l<5;l++){
                        if(i!=j&&i!=k&&i!=l&&j!=k&&j!=l&&k!=l)
                        System.out.print(" "+i+j+k+l);
                    }
                }
            }
        }
    }
}
