/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericosdelimitados;

import java.util.List;

/**
 *
 * @author Antonio
 */
class CalculationService {
    
    public static <T extends Comparable <?super T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for(T item:list){
            if(item.compareTo(max)>0){
                max=item;
            }
        }
        return max;
    }
}
