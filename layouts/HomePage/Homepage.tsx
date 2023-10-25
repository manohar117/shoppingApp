import { Carousel } from "./components/Carousel";
import { ExploretopProducts } from "./components/ExploretopProducts";
import { Heros } from "./components/Heros";
import { ProductServices } from "./components/ProductServices";

export const Homepage = () => {
    return (
         <> 
               <ExploretopProducts/>
                <Carousel/>
                <Heros/>
                <ProductServices/>
         
         </>
    );
}