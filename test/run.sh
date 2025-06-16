newman run CursoMicroservicios.postman_collection.json -d CasosPruebaPostman.csv  -r htmlextra

#Instalamos newman, para ello debes tener instalado node
# npm install -g newman

#para ejecutar en el cmd o terminal de visual studio
#cd test
#chmod +x run.sh
#./run.sh


#para tener un reporte en html mas ordenado
# npm install -g newman-reporter-htmlextra

#en el run.sh aumentamos -r htmlextra
#y ejecutamos en el terminal con ./run.sh