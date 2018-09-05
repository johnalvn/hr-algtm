<?php 
    /**
     * 
     * @var array $arr
     * 
     */
    $arr = Array(5,4,3,2,1);
    $arrLen = count($arr);
    $stop = $arrLen - 1;
    for ($i = 0; $i <= $stop; $i++) {
        for ($j = 0; $j < $stop; $j++) {
            if ($arr[$j] > $arr[$j + 1]) {
                $temp = $arr[$j];
                $arr[$j] = $arr[$j+1];
                $arr[$j+1] = $temp;
            }
        }
    }
    
    print_r($arr)
    
    

?>