FROM node

WORKDIR /devops

COPY package*.json ./devops

RUN npm install package.json

COPY . .

EXPOSE 6000

CMD ["node", "server.js"]
